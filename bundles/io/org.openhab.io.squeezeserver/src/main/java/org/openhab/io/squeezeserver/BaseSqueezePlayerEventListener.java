/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.io.squeezeserver;

import org.openhab.io.squeezeserver.SqueezePlayer.PlayerEvent;

/**
 * @author Ben Jones
 * @since 1.4.0
 */
public class BaseSqueezePlayerEventListener implements SqueezePlayerEventListener {

    @Override
    public void powerChangeEvent(PlayerEvent event) {
    }

    @Override
    public void modeChangeEvent(PlayerEvent event) {
    }

    @Override
    public void volumeChangeEvent(PlayerEvent event) {
    }

    @Override
    public void muteChangeEvent(PlayerEvent event) {
    }

    @Override
    public void currentPlaylistIndexEvent(PlayerEvent event) {
    }

    @Override
    public void currentPlayingTimeEvent(PlayerEvent event) {
    }

    @Override
    public void numberPlaylistTracksEvent(PlayerEvent event) {
    }

    @Override
    public void currentPlaylistShuffleEvent(PlayerEvent event) {
    }

    @Override
    public void currentPlaylistRepeatEvent(PlayerEvent event) {
    }

    @Override
    public void titleChangeEvent(PlayerEvent event) {
    }

    @Override
    public void albumChangeEvent(PlayerEvent event) {
    }

    @Override
    public void artistChangeEvent(PlayerEvent event) {
    }

    @Override
    public void coverArtChangeEvent(PlayerEvent event) {
    }

    @Override
    public void yearChangeEvent(PlayerEvent event) {
    }

    @Override
    public void genreChangeEvent(PlayerEvent event) {
    }

    @Override
    public void remoteTitleChangeEvent(PlayerEvent event) {
    }

    @Override
    public void irCodeChangeEvent(PlayerEvent event) {
    }
}
