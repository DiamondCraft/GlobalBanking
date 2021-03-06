/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package me.tjs238.plugins.globalbank;

import java.io.Serializable;
import org.bukkit.Material;

/**
 *
 * @author tjs238
 */
public class BMaterialData implements Serializable
{
    private static final long serialVersionUID = 1385103110780786554L;
    @SuppressWarnings("unused")
	private final int type;
    private byte data = 0;

    public BMaterialData(final int type)
    {
        this(type, (byte) 0);
    }

    public BMaterialData(final Material type)
    {
        this(type, (byte) 0);
    }

    public BMaterialData(final int type, final byte data)
    {
        this.type = type;
        this.data = data;
    }

    public BMaterialData(final Material type, final byte data)
    {
        this(type.getId(), data);
    }
    
    public byte getData()
    {
        return data;
    }
    
    public void setData(byte data)
    {
        this.data = data;
    }
}
