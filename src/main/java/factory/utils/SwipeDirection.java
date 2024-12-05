package factory.utils;

import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;

public enum SwipeDirection {
    UP {
        @Override
        public PointOption getEndPoint(Dimension dimension, int swipeDistance) {
            return PointOption.point(dimension.width / 2, swipeDistance);
        }
    },
    DOWN {
        @Override
        public PointOption getEndPoint(Dimension dimension, int swipeDistance) {
            return PointOption.point(dimension.width / 2, dimension.height - swipeDistance);
        }
    },
    LEFT {
        @Override
        public PointOption getEndPoint(Dimension dimension, int swipeDistance) {
            return PointOption.point(swipeDistance, dimension.height / 2);
        }
    },
    RIGHT {
        @Override
        public PointOption getEndPoint(Dimension dimension, int swipeDistance) {
            return PointOption.point(dimension.width - swipeDistance, dimension.height / 2);
        }
    };

    public abstract PointOption getEndPoint(Dimension dimension, int swipeDistance);
}
