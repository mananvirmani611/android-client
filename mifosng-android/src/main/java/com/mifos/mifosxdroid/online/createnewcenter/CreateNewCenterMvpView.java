package com.mifos.mifosxdroid.online.createnewcenter;

import com.google.android.gms.maps.MapView;
import com.mifos.mifosxdroid.base.MvpView;
import com.mifos.objects.group.Center;
import com.mifos.objects.organisation.Office;

import java.util.List;

/**
 * Created by Rajan Maurya on 06/06/16.
 */
public interface CreateNewCenterMvpView extends MvpView {

    void showOffices(List<Office> offices);

    void centerCreatedSuccessfully(Center center);

    void showFetchingError(String s);
}
