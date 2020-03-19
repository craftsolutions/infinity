package craftsolutions.meatsuko.java.infinity.thread;

import craftsolutions.meatsuko.java.infinity.InfinityConnection;
import craftsolutions.meatsuko.java.infinity.dto.IDataDTO;
import craftsolutions.meatsuko.java.infinity.dto.IPacketDTO;
import craftsolutions.meatsuko.java.infinity.handler.IHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ConnectionThreadPacket extends ConnectionThread<ConnectionThreadPacket>
{
    protected OutputStream _outputStream;
    protected InputStream _inputStream;


    @Override
    public void run()
    {
        try
        {
            this._outputStream = this._socket.getOutputStream();
            this._inputStream = this._socket.getInputStream();

            this._socket.setTcpNoDelay(true);

            while (true)
            {

            }

        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }

    @Override
    public void sendData(IDataDTO iDataDTO)
    {
        IPacketDTO iPacketDTO = (IPacketDTO) iDataDTO;

        try
        {
            this._outputStream.write(0);
        }
        catch (IOException exception)
        {
            exception.printStackTrace();
        }
    }
}
