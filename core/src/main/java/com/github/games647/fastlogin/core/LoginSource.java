package com.github.games647.fastlogin.core;

import java.net.InetSocketAddress;

public interface LoginSource {

    void setOnlineMode() throws Exception;

    void kick(String message) throws Exception;

    InetSocketAddress getAddress();
}
