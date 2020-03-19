package craftsolutions.meatsuko.java.infinity.dto;

import craftsolutions.meatsuko.java.infinity.InfinityConnection;

public class ShellDTO
{
    private InfinityConnection _connection;
    private Object _object;

    public void setConnection(InfinityConnection connection)
    {
        this._connection = connection;
    }
    public void setObject(Object _object)
    {
        this._object = _object;
    }

    public InfinityConnection getConnection()
    {
        return this._connection;
    }

    public Object getObject()
    {
        return this._object;
    }

    public <T> T getObject(T objectClass)
    {
        return (T) this.getObject();
    }

}
