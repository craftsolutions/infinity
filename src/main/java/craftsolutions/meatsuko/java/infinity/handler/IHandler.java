package craftsolutions.meatsuko.java.infinity.handler;

import craftsolutions.meatsuko.java.infinity.dto.ShellDTO;

import java.io.IOException;

public interface IHandler
{
    void handle(ShellDTO shellDTO) throws IOException;
}
