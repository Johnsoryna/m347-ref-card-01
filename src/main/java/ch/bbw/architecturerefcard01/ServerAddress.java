package ch.bbw.architecturerefcard01;

import java.net.InetAddress;
import java.net.UnknownHostException;

final class ServerAddress {

    private ServerAddress() {
    }

    static String get() throws UnknownHostException {
        return InetAddress.getLocalHost().getHostAddress();
    }
}
