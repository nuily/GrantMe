package nyc.c4q.rusili.grantme.recyclerview;

import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.rusili.grantme.R;
import nyc.c4q.rusili.grantme.network.pojo.JSONCourses;

public class CourseAdapter extends RecyclerView.Adapter {
    List<JSONCourses> listofCourses = new ArrayList<>();
    private int mViewId;

    public CourseAdapter(int viewId){
        this.mViewId = viewId;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder (ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View mView = inflater.inflate(R.layout.course_item, parent, false);
        CourseViewholder viewHolder = new CourseViewholder(mView);

        return viewHolder;
    }

    @Override
    @Nullable
    public void onBindViewHolder (RecyclerView.ViewHolder holder, final int position) {

        CourseViewholder CourseViewholder = (CourseViewholder) holder;
        JSONCourses item = listofCourses.get(position);

        if(item.getBorough()!=null){



        switch (mViewId){
            case R.id.brooklyn:
                if(item.getBorough().equalsIgnoreCase("Queens")){
                    CourseViewholder.bind(item);
                }
                break;
            case R.id.queens:
                if(item.getBorough().equalsIgnoreCase("Brooklyn")){
                    CourseViewholder.bind(item);
                }
                break;
            case R.id.bronx:
                if(item.getBorough().equalsIgnoreCase("Bronx")){
                    CourseViewholder.bind(item);
                }
        }
        }

    }

    @Override
    @Nullable
    public int getItemCount () {
        return listofCourses.size();
    }

    public void setListofCourses(List<JSONCourses> listofCourses) {
        this.listofCourses = listofCourses;
        this.notifyDataSetChanged();
    }


}