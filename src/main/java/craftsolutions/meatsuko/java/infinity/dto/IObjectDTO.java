package craftsolutions.meatsuko.java.infinity.dto;

import craftsolutions.meatsuko.java.infinity.handler.HandlerObject;

import java.io.IOException;
import java.io.Serializable;

public interface IObjectDTO<T extends HandlerObject> extends Serializable, IDataDTO
{
    void handle(T iHandler, ShellDTO shellDTO) throws IOException;
}
