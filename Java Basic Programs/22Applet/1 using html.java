import java.applet.Applet;
import java.awt.Graphics;

public class cube extends Applet
{
public void paint(Graphics g)
{
g.drawString("Welcome to applet",100,100);

}


}


//////////////html///////////

<html>
<body>
<applet code="cube.class" width="150" height="150" ></applet>
</body>

</html>