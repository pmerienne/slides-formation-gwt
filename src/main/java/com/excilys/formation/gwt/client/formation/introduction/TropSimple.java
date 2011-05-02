package com.excilys.formation.gwt.client.formation.introduction;

import com.excilys.formation.gwt.client.slider.slides.WidgetSlide;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

public class TropSimple extends WidgetSlide {

    interface Binder extends UiBinder<Widget, Object> {}

    private static final Binder uiBinder = GWT.create(Binder.class);

    public TropSimple() {
        super(uiBinder);
    }

    @UiHandler("button")
    void clicked(ClickEvent e) {
        Window.alert("Mais c'est trop simple !");
    }

}