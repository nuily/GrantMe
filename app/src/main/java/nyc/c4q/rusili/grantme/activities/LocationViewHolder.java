package nyc.c4q.rusili.grantme.activities;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.rusili.grantme.R;

/**
 * Created by huilin on 2/18/17.
 */
public class LocationViewHolder extends RecyclerView.ViewHolder {

    private final TextView boroughTV;
    private final View cardView;

    private CardView mCardView;

    public LocationViewHolder(View itemView) {
        super(itemView);
        cardView = itemView;
        boroughTV = (TextView) itemView.findViewById(R.id.card_tv);
        mCardView=(CardView) itemView.findViewById(R.id.location_card);
    }

    public void bind(int position) {

        switch (position) {
            case 0:
                boroughTV.setText("Brooklyn");
                break;
            case 1:
                boroughTV.setText("Bronx");
                break;
            case 2:
                boroughTV.setText("Manhattan");
                break;
            case 3:
                boroughTV.setText("Queens");
                break;
            case 4:
                boroughTV.setText("Staten Island");
                break;
        }
    }

    public CardView getmCardView() {
        return mCardView;
    }
}