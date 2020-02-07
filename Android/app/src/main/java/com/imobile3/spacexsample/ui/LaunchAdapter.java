package com.imobile3.spacexsample.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.imobile3.spacexsample.R;
import com.imobile3.spacexsample.dto.Launch;
import com.squareup.picasso.Picasso;

import androidx.annotation.NonNull;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class LaunchAdapter extends PagedListAdapter<Launch, LaunchAdapter.ViewHolder> {

    private static final SimpleDateFormat INPUT_DATE_FORMAT =
            new SimpleDateFormat("yyyy-MM", Locale.US);

    private static final SimpleDateFormat OUTPUT_DATE_FORMAT =
            new SimpleDateFormat("yyyy", Locale.US);

    private static final DiffUtil.ItemCallback<Launch> DIFF_CALLBACK =
            new DiffUtil.ItemCallback<Launch>() {
                @Override
                public boolean areItemsTheSame(Launch oldItem, Launch newItem) {
                    return oldItem.getFlightNumber() == newItem.getFlightNumber();
                }

                @Override
                public boolean areContentsTheSame(Launch oldItem, @NonNull Launch newItem) {
                    return oldItem.equals(newItem);
                }
            };

    @NonNull
    private Context mContext;
    private List<Launch> mLaunches = new ArrayList<>();

    public LaunchAdapter(@NonNull Context context) {
        super(DIFF_CALLBACK);
        mContext = context;
    }

    public void setLaunches(@NonNull List<Launch> launches) {
        mLaunches = launches;
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mLaunches.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.launch_list_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Launch launch = mLaunches.get(position);

        if (launch != null) {

            String imageUri = launch.getLinks().getMissionPatchSmall();
            if (!TextUtils.isEmpty(imageUri)) {
                Picasso.get()
                        .load(imageUri)
                        .placeholder(R.drawable.ic_rocket_placeholder)
                        .error(R.drawable.ic_rocket_placeholder)
                        .into(holder.mPatchImage);
            } else {
                Picasso.get()
                        .load(R.drawable.ic_rocket_placeholder)
                        .into(holder.mPatchImage);
            }

            holder.mMissionName.setText(launch.getMissionName());
            holder.mRocketName.setText(launch.getRocket().getRocketName());
            holder.mSiteName.setText(launch.getLaunchSite().getSiteName());

            String launchDateUtc = launch.getLaunchDateUtc();
            if (!TextUtils.isEmpty(launchDateUtc)) {
                try {
                    Date date = INPUT_DATE_FORMAT.parse(launchDateUtc);
                    holder.mLaunchDate.setText(OUTPUT_DATE_FORMAT.format(date));
                } catch (ParseException ex) {
                    holder.mLaunchDate.setText("N/A");
                }
            } else {
                holder.mLaunchDate.setText("N/A");
            }

            int launchColor;
            if (launch.isLaunchSuccess()) {
                launchColor = R.color.green_emerald;
            } else {
                launchColor = R.color.red_pomegranate;
            }
            holder.mLaunchSuccessIndicator
                    .setBackgroundColor(mContext.getResources().getColor(launchColor));
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mPatchImage;
        private TextView mMissionName;
        private TextView mRocketName;
        private TextView mSiteName;
        private TextView mLaunchDate;
        private View mLaunchSuccessIndicator;

        ViewHolder(View view) {
            super(view);
            mPatchImage = view.findViewById(R.id.image_patch);
            mMissionName = view.findViewById(R.id.label_mission);
            mRocketName = view.findViewById(R.id.label_rocket);
            mSiteName = view.findViewById(R.id.label_site);
            mLaunchDate = view.findViewById(R.id.label_date);
            mLaunchSuccessIndicator = view.findViewById(R.id.indicator_launch_success);
        }
    }
}
