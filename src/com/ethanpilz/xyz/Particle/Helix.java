package com.ethanpilz.xyz.Particle;

import net.minecraft.server.v1_11_R1.EnumParticle;
import net.minecraft.server.v1_11_R1.PacketPlayOutWorldParticles;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Helix {

    EnumParticle particletype;
    boolean longdistance;
    Location location;
    float offsetx;
    float offsety;
    float offsetz;
    float speed;
    int amount;


    public Helix(EnumParticle particletype, Location location, boolean londgdistance, float offsetx, float offsety, float offsetz, float speed, int amount) {
        this.particletype = particletype;
        this.location = location;
        this.longdistance = londgdistance;
        this.offsetx = offsetx;
        this.offsety = offsety;
        this.offsetz = offsetz;
        this.speed = speed;
        this.amount = amount;
    }

    public void sendPlayer(Player player){
        PacketPlayOutWorldParticles packet = new PacketPlayOutWorldParticles(this.particletype, this.longdistance, (float)this.location.getX(), (float)this.location.getY(), (float)this.location.getZ(), this.offsetx, this.offsety, this.offsetz, this.speed, this.amount);
        ((CraftPlayer)player).getHandle().playerConnection.sendPacket(packet);
    }
}