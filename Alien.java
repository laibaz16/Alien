import java.awt.*; 
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Alien {
  int appletx=1439, applety=838;
  int alien_xsize=40, alien_ysize=40;
  int alien_x=0, alien_y=0;
  int alien_xsp=3, alien_ysp=0;
  int life=0, pic2=0;
  Image stage1,stage2;
  
  
  int a=0, y=0, move=0, down=0, b=0, c=0;
  
  public void create(Image s1, Image s2)
  {
    stage1=s1;
    stage2=s2;
  }
  public void move()
  {
//   for (int a=0; a<1000; a+=60)
//    {
//      for (int y=0+down; y<100+down; y+=45)
//      {
//        if (pic2==0)
//        { 
//      alien_x+=alien_xsp;    pic2=1;
//        }
//        else if (pic2==1)
//        {
//   
//      for ( a=0+move; a<1000+move; a+=45)
//    {
//       
//   }
//     
//  }
//}
//   }
  }
   public void paint (Graphics g) {
         for ( a=0+move; a<1000+move; a+=45)
    {
      for (int y=0+down; y<100+down; y+=45)
      {
        if (pic2==0)
        {
//          g.drawImage(stage1,a, y+6,alien_xsize,alien_ysize);
          pic2=1;
        }
        else if (pic2==1)
        {
//          g.drawImage(stage2,a,y,alien_xsize+5,alien_ysize+20);
          System.out.println("second picture");      
          pic2=0;
        }
         if (a+alien_xsize>=appletx)
        {       
          b=1;
          c=1;
          down=down+10;
        }
        else if(a<=0) 
        {
          b=0;
          down=down+10;
          if(pic2==0)
            pic2=1;
          if(pic2==1)
            pic2=0;
        }
      }
         }
   }
}
