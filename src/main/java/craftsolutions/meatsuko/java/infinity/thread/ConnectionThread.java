package craftsolutions.meatsuko.java.infinity.thread;

import craftsolutions.meatsuko.java.infinity.InfinityConnection;
import craftsolutions.meatsuko.java.infinity.dto.IDataDTO;
import craftsolutions.meatsuko.java.infinity.handler.IHandler;
import org.omg.PortableServer.THREAD_POLICY_ID;

import java.io.IOException;
import java.net.Socket;

public abstract class ConnectionThread<T> extends Thread
{
    protected Socket _socket;
    protected InfinityConnection _connection;


    public InfinityConnection getConnection()
    {
        return this._connection;
    }
    public T setConnection(InfinityConnection connection)
    {
        this._connection = connection;

        return (T) this;
    }

    public Socket getSocket()
    {
        return this._socket;

    }
    public T setSocket(Socket socket)
    {
        this._socket = socket;

        return (T) this;
    }

    @Override
    public abstract void run();

    public abstract void sendData(IDataDTO iDataDTO);

    public ConnectionThread newInstance()
    {
        try {
            return this.getClass().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
