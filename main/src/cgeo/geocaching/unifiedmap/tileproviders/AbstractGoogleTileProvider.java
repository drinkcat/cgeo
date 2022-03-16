package cgeo.geocaching.unifiedmap.tileproviders;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.unifiedmap.AbstractUnifiedMap;

import androidx.annotation.StringRes;

import com.google.android.gms.maps.GoogleMap;

public class AbstractGoogleTileProvider extends AbstractTileProvider {

    final int mapType;

    AbstractGoogleTileProvider(final int mapType, final @StringRes int nameRes) {
        super(0, 18); // @todo: set actual values for zoomMin / zoomMax
        this.mapType = mapType;
        this.tileProviderName = CgeoApplication.getInstance().getString(nameRes);
    }

    public void setMapType(final GoogleMap googleMap) {
        if (googleMap != null) {
            googleMap.setMapType(mapType);
        }
    }

    public AbstractUnifiedMap getMap() {
        return TileProviderFactory.MAP_GOOGLE;
    }

}