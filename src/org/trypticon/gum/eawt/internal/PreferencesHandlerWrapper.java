/*
 * Gum - a thin shim around the com.apple extension classes
 * Copyright (C) 2013  Trejkaz
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.trypticon.gum.eawt.internal;

import com.apple.eawt.AppEvent;
import org.trypticon.gum.eawt.event.PreferencesEvent;
import org.trypticon.gum.eawt.event.PreferencesHandler;

/**
 * @author trejkaz
 */
class PreferencesHandlerWrapper implements com.apple.eawt.PreferencesHandler {
    private final PreferencesHandler delegate;

    public PreferencesHandlerWrapper(PreferencesHandler delegate) {
        this.delegate = delegate;
    }

    @Override
    public void handlePreferences(AppEvent.PreferencesEvent event) {
        delegate.handlePreferences(new PreferencesEvent());
    }
}
