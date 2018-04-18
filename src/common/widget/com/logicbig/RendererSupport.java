package common.widget.com.logicbig;

import common.widget.org.jwidgets.SimpleRenderer;

public class RendererSupport {
    public void render(Object object) {
        new SimpleRenderer().renderAsString(object);
    }
}