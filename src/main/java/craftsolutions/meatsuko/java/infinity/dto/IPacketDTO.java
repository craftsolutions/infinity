package craftsolutions.meatsuko.java.infinity.dto;

import craftsolutions.meatsuko.java.infinity.handler.HandlerPacket;

import java.io.IOException;

public interface IPacketDTO<T extends HandlerPacket> extends IDataDTO
{
    void handle(T iHandler, ShellDTO shellDTO) throws IOException;
}
