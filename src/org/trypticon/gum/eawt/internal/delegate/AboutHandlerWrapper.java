package org.trypticon.gum.eawt.internal.delegate;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.AboutEvent;
import org.trypticon.gum.eawt.event.AboutHandler;

public class AboutHandlerWrapper implements com.apple.eawt.AboutHandler {
    private final AboutHandler delegate;

    public AboutHandlerWrapper(AboutHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void handleAbout(AppEvent.AboutEvent event) {
        delegate.handleAbout(new AboutEvent());
    }
}