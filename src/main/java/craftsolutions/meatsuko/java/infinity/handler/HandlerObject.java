package craftsolutions.meatsuko.java.infinity.handler;

import craftsolutions.meatsuko.java.infinity.dto.IObjectDTO;
import craftsolutions.meatsuko.java.infinity.dto.ShellDTO;

import java.io.IOException;

public class HandlerObject implements IHandler
{
    public void handle(ShellDTO shellDTO) throws IOException
    {
        ((IObjectDTO) shellDTO.getObject()).handle(this, shellDTO);
    }
}
