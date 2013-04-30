package anotherDEVer.ArrowLightning;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.*;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.Location;
import org.bukkit.World;

public final class ArrowLightning extends JavaPlugin implements Listener
{
	public void onEnable()
	{
		getServer().getPluginManager().registerEvents(this,  this);
	}
	
	@EventHandler
	public void ArrowHit(ProjectileHitEvent event)
	{
		Entity arrow = event.getEntity();
		
		if (arrow.getType() == EntityType.ARROW)
		{
			Location hit = arrow.getLocation();
			
			World zone = hit.getWorld();
			
			zone.strikeLightning(hit);
			zone.strikeLightning(hit);
			zone.strikeLightning(hit);
			zone.strikeLightning(hit);
			zone.strikeLightning(hit);
		}
	}
}
