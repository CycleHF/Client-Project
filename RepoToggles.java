package net.minecraft.src;

import java.awt.Color;
import org.lwjgl.input.Keyboard;
import java.util.ArrayList;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import java.util.List;

public class RepoToggles extends Gui //Text GUI located in GuiIngame. 
{
	private static boolean keyStates[]; //Thanks Blic! (*Credit*)
    public static boolean hackGUI = true;
    public static boolean hackHighJump = false; //Hack located in EntityLving.
    public static float jumpControl = 3; //Float to control jump height (Used via console)
    public static double jumpHeight = 1; //How high in blocks
    public static boolean hackStep = false; //Hack located in...(Fill in)
    public static float stepControl = 1; //Float to control step
    public static boolean hackFly = false;
    public static float flyControl = 1;
    public static boolean hackJesus = false;
    public static boolean hackSpider = false;
    
    public RepoToggles()
    {
        keyStates = new boolean [256];
    }
    
    public static void RepoToggle(Minecraft mc)
    {
    //All toggles Here
    	if(checkKey(Keyboard.KEY_COMMA)) //If Key ... is pressed then...
        {
            hackGUI = !hackGUI; //Toggle the hack.
        }
    	if(checkKey(Keyboard.KEY_J)) //If Key ... is pressed then...
        {
            hackHighJump = !hackHighJump; //Toggle the hack.
        }
        if(checkKey(Keyboard.KEY_PERIOD)) //If Key ... is pressed then...
        {
            hackStep = !hackStep; //Toggle the hack.
        }
        if(checkKey(Keyboard.KEY_F)) //If Key ... is pressed then...
        {
            hackFly = !hackFly; //Toggle the hack.
        }
        if(checkKey(Keyboard.KEY_BACKSLASH)) //If Key ... is pressed then...
        {
            hackSpider = !hackSpider; //Toggle the hack.
        }
        if(checkKey(Keyboard.KEY_SLASH))//If Key ... is pressed then...
        {
            hackJesus = !hackJesus; //Toggle the hack.
        }
	}

	public void Floats()
    {
        
    }
    
    private static int currentKey;
    public static boolean checkKey(int i)
    {
        if(Minecraft.currentScreen != null)
        {
            return false;
        }
        if(Keyboard.isKeyDown(i) != keyStates[i])
        {
            return keyStates[i] = !keyStates[i];
        } else
        {
            return false;
        }
    }

}