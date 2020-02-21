package frc.paths;

import com.team319.trajectory.Path;

public class RightSweep extends Path {
   // dt,x,y,left.pos,left.vel,left.acc,left.jerk,center.pos,center.vel,center.acc,center.jerk,right.pos,right.vel,right.acc,right.jerk,heading
	private static final double[][] points = {
				{0.0200,10.2528,-11.2000,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,0.0000},
				{0.0200,10.2584,-11.2000,0.0084,0.2800,7.0000,-0.0000,0.0084,0.2800,7.0000,0.0000,0.0084,0.2800,7.0000,-0.0000,0.0000},
				{0.0200,10.2668,-11.2000,0.0168,0.4200,7.0000,0.0000,0.0168,0.4200,7.0000,0.0000,0.0168,0.4200,7.0000,0.0000,0.0000},
				{0.0200,10.2780,-11.2000,0.0280,0.5600,7.0000,0.0000,0.0280,0.5600,7.0000,0.0000,0.0280,0.5600,7.0000,0.0000,0.0000},
				{0.0200,10.2920,-11.2000,0.0420,0.7000,7.0000,-0.0000,0.0420,0.7000,7.0000,0.0000,0.0420,0.7000,7.0000,-0.0000,0.0000},
				{0.0200,10.3088,-11.2000,0.0588,0.8400,7.0000,0.0000,0.0588,0.8400,7.0000,0.0000,0.0588,0.8400,7.0000,0.0000,0.0000},
				{0.0200,10.3284,-11.2000,0.0784,0.9800,7.0000,0.0000,0.0784,0.9800,7.0000,0.0000,0.0784,0.9800,7.0000,0.0000,0.0000},
				{0.0200,10.3508,-11.2000,0.1008,1.1200,7.0000,0.0000,0.1008,1.1200,7.0000,0.0000,0.1008,1.1200,7.0000,0.0000,0.0000},
				{0.0200,10.3760,-11.2000,0.1260,1.2600,7.0000,0.0000,0.1260,1.2600,7.0000,0.0000,0.1260,1.2600,7.0000,0.0000,0.0000},
				{0.0200,10.4040,-11.2000,0.1540,1.4000,7.0000,-0.0000,0.1540,1.4000,7.0000,0.0000,0.1540,1.4000,7.0000,-0.0000,0.0000},
				{0.0200,10.4348,-11.2000,0.1848,1.5400,7.0000,0.0000,0.1848,1.5400,7.0000,0.0000,0.1848,1.5400,7.0000,0.0000,0.0000},
				{0.0200,10.4684,-11.2000,0.2184,1.6800,7.0000,-0.0000,0.2184,1.6800,7.0000,0.0000,0.2184,1.6800,7.0000,-0.0000,0.0000},
				{0.0200,10.5048,-11.2000,0.2548,1.8200,7.0000,0.0000,0.2548,1.8200,7.0000,0.0000,0.2548,1.8200,7.0000,0.0000,0.0000},
				{0.0200,10.5440,-11.2000,0.2940,1.9600,7.0000,-0.0000,0.2940,1.9600,7.0000,0.0000,0.2940,1.9600,7.0000,-0.0000,0.0000},
				{0.0200,10.5860,-11.2000,0.3360,2.1000,7.0000,0.0000,0.3360,2.1000,7.0000,0.0000,0.3360,2.1000,7.0000,0.0000,0.0000},
				{0.0200,10.6308,-11.2000,0.3808,2.2400,7.0000,0.0000,0.3808,2.2400,7.0000,0.0000,0.3808,2.2400,7.0000,0.0000,0.0000},
				{0.0200,10.6784,-11.2000,0.4284,2.3800,7.0000,-0.0000,0.4284,2.3800,7.0000,0.0000,0.4284,2.3800,7.0000,-0.0000,0.0000},
				{0.0200,10.7288,-11.2000,0.4788,2.5200,7.0000,0.0000,0.4788,2.5200,7.0000,0.0000,0.4788,2.5200,7.0000,0.0000,0.0000},
				{0.0200,10.7820,-11.2000,0.5320,2.6600,7.0000,0.0000,0.5320,2.6600,7.0000,0.0000,0.5320,2.6600,7.0000,0.0000,0.0000},
				{0.0200,10.8380,-11.2000,0.5880,2.8000,7.0000,-0.0000,0.5880,2.8000,7.0000,0.0000,0.5880,2.8000,7.0000,-0.0000,0.0000},
				{0.0200,10.8968,-11.2000,0.6468,2.9400,7.0000,0.0000,0.6468,2.9400,7.0000,0.0000,0.6468,2.9400,7.0000,0.0000,0.0000},
				{0.0200,10.9584,-11.2000,0.7084,3.0800,7.0000,0.0000,0.7084,3.0800,7.0000,0.0000,0.7084,3.0800,7.0000,0.0000,0.0000},
				{0.0200,11.0228,-11.2000,0.7728,3.2200,7.0000,0.0000,0.7728,3.2200,7.0000,0.0000,0.7728,3.2200,7.0000,0.0000,0.0000},
				{0.0200,11.0900,-11.2000,0.8400,3.3600,7.0000,0.0000,0.8400,3.3600,7.0000,0.0000,0.8400,3.3600,7.0000,0.0000,0.0000},
				{0.0200,11.1600,-11.2000,0.9100,3.5000,7.0000,-0.0000,0.9100,3.5000,7.0000,0.0000,0.9100,3.5000,7.0000,-0.0000,0.0000},
				{0.0200,11.2328,-11.2000,0.9828,3.6400,7.0000,-0.0000,0.9828,3.6400,7.0000,0.0000,0.9828,3.6400,7.0000,-0.0000,0.0000},
				{0.0200,11.3084,-11.2000,1.0584,3.7800,7.0000,-0.0000,1.0584,3.7800,7.0000,0.0000,1.0584,3.7800,7.0000,-0.0000,0.0000},
				{0.0200,11.3868,-11.2000,1.1368,3.9200,7.0000,0.0000,1.1368,3.9200,7.0000,0.0000,1.1368,3.9200,7.0000,0.0000,0.0000},
				{0.0200,11.4680,-11.2000,1.2180,4.0600,7.0000,0.0000,1.2180,4.0600,7.0000,0.0000,1.2180,4.0600,7.0000,0.0000,0.0000},
				{0.0200,11.5520,-11.2000,1.3020,4.2000,7.0000,-0.0000,1.3020,4.2000,7.0000,0.0000,1.3020,4.2000,7.0000,-0.0000,0.0000},
				{0.0200,11.6388,-11.2000,1.3888,4.3400,7.0000,0.0000,1.3888,4.3400,7.0000,0.0000,1.3888,4.3400,7.0000,0.0000,0.0000},
				{0.0200,11.7284,-11.2000,1.4784,4.4800,7.0000,-0.0000,1.4784,4.4800,7.0000,0.0000,1.4784,4.4800,7.0000,-0.0000,0.0000},
				{0.0200,11.8208,-11.2000,1.5708,4.6200,7.0000,0.0000,1.5708,4.6200,7.0000,0.0000,1.5708,4.6200,7.0000,0.0000,0.0000},
				{0.0200,11.9160,-11.2000,1.6660,4.7600,7.0000,-0.0000,1.6660,4.7600,7.0000,0.0000,1.6660,4.7600,7.0000,-0.0000,0.0000},
				{0.0200,12.0140,-11.2000,1.7640,4.9000,7.0000,0.0000,1.7640,4.9000,7.0000,0.0000,1.7640,4.9000,7.0000,0.0000,0.0000},
				{0.0200,12.1148,-11.2000,1.8648,5.0400,7.0000,0.0000,1.8648,5.0400,7.0000,0.0000,1.8648,5.0400,7.0000,0.0000,0.0000},
				{0.0200,12.2184,-11.2000,1.9684,5.1800,7.0000,-0.0000,1.9684,5.1800,7.0000,0.0000,1.9684,5.1800,7.0000,-0.0000,0.0000},
				{0.0200,12.3248,-11.2000,2.0748,5.3200,7.0000,0.0000,2.0748,5.3200,7.0000,0.0000,2.0748,5.3200,7.0000,0.0000,0.0000},
				{0.0200,12.4340,-11.2000,2.1840,5.4600,7.0000,-0.0000,2.1840,5.4600,7.0000,0.0000,2.1840,5.4600,7.0000,-0.0000,0.0000},
				{0.0200,12.5460,-11.2000,2.2960,5.6000,7.0000,0.0000,2.2960,5.6000,7.0000,0.0000,2.2960,5.6000,7.0000,0.0000,0.0000},
				{0.0200,12.6608,-11.2000,2.4108,5.7400,7.0000,-0.0000,2.4108,5.7400,7.0000,0.0000,2.4108,5.7400,7.0000,-0.0000,0.0000},
				{0.0200,12.7784,-11.2000,2.5284,5.8800,7.0000,0.0000,2.5284,5.8800,7.0000,0.0000,2.5284,5.8800,7.0000,0.0000,0.0000},
				{0.0200,12.8988,-11.2000,2.6488,6.0200,7.0000,0.0000,2.6488,6.0200,7.0000,0.0000,2.6488,6.0200,7.0000,0.0000,0.0000},
				{0.0200,13.0220,-11.2000,2.7720,6.1600,7.0000,-0.0000,2.7720,6.1600,7.0000,0.0000,2.7720,6.1600,7.0000,-0.0000,0.0000},
				{0.0200,13.1480,-11.2000,2.8980,6.3000,7.0000,0.0000,2.8980,6.3000,7.0000,0.0000,2.8980,6.3000,7.0000,0.0000,0.0000},
				{0.0200,13.2768,-11.2000,3.0268,6.4400,7.0000,0.0000,3.0268,6.4400,7.0000,0.0000,3.0268,6.4400,7.0000,0.0000,0.0000},
				{0.0200,13.4084,-11.2000,3.1584,6.5800,7.0000,-0.0000,3.1584,6.5800,7.0000,0.0000,3.1584,6.5800,7.0000,-0.0000,0.0000},
				{0.0200,13.5428,-11.2000,3.2928,6.7200,7.0000,0.0000,3.2928,6.7200,7.0000,0.0000,3.2928,6.7200,7.0000,0.0000,0.0000},
				{0.0200,13.6800,-11.2000,3.4300,6.8600,7.0000,-0.0000,3.4300,6.8600,7.0000,0.0000,3.4300,6.8600,7.0000,-0.0000,0.0000},
				{0.0200,13.8200,-11.2000,3.5700,7.0000,7.0000,0.0000,3.5700,7.0000,7.0000,0.0000,3.5700,7.0000,7.0000,0.0000,0.0000},
				{0.0200,13.9600,-11.2000,3.7100,7.0000,0.0000,-350.0000,3.7100,7.0000,7.0000,0.0000,3.7100,7.0000,0.0000,-350.0000,0.0000},
				{0.0200,14.1000,-11.2000,3.8500,7.0000,-0.0000,-0.0000,3.8500,7.0000,7.0000,0.0000,3.8500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,14.2400,-11.2000,3.9900,7.0000,0.0000,0.0000,3.9900,7.0000,7.0000,0.0000,3.9900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,14.3800,-11.2000,4.1300,7.0000,0.0000,-0.0000,4.1300,7.0000,7.0000,0.0000,4.1300,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,14.5200,-11.2000,4.2700,7.0000,0.0000,0.0000,4.2700,7.0000,7.0000,0.0000,4.2700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,14.6600,-11.2000,4.4100,7.0000,0.0000,0.0000,4.4100,7.0000,7.0000,0.0000,4.4100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,14.8000,-11.2000,4.5500,7.0000,-0.0000,-0.0000,4.5500,7.0000,7.0000,0.0000,4.5500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,14.9400,-11.2000,4.6900,7.0000,0.0000,0.0000,4.6900,7.0000,7.0000,0.0000,4.6900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,15.0800,-11.2000,4.8300,7.0000,0.0000,-0.0000,4.8300,7.0000,7.0000,0.0000,4.8300,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,15.2200,-11.2000,4.9700,7.0000,-0.0000,-0.0000,4.9700,7.0000,7.0000,0.0000,4.9700,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,15.3600,-11.2000,5.1100,7.0000,0.0000,0.0000,5.1100,7.0000,7.0000,0.0000,5.1100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,15.5000,-11.2000,5.2500,7.0000,0.0000,0.0000,5.2500,7.0000,7.0000,0.0000,5.2500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,15.6400,-11.2000,5.3900,7.0000,-0.0000,-0.0000,5.3900,7.0000,7.0000,0.0000,5.3900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,15.7800,-11.2000,5.5300,7.0000,0.0000,0.0000,5.5300,7.0000,7.0000,0.0000,5.5300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,15.9200,-11.2000,5.6700,7.0000,0.0000,-0.0000,5.6700,7.0000,7.0000,0.0000,5.6700,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,16.0600,-11.2000,5.8100,7.0000,-0.0000,-0.0000,5.8100,7.0000,7.0000,0.0000,5.8100,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,16.2000,-11.2000,5.9500,7.0000,0.0000,0.0000,5.9500,7.0000,7.0000,0.0000,5.9500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,16.3400,-11.2000,6.0900,7.0000,0.0000,0.0000,6.0900,7.0000,7.0000,0.0000,6.0900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,16.4800,-11.2000,6.2300,7.0000,-0.0000,-0.0000,6.2300,7.0000,7.0000,0.0000,6.2300,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,16.6200,-11.2000,6.3700,7.0000,0.0000,0.0000,6.3700,7.0000,7.0000,0.0000,6.3700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,16.7600,-11.2000,6.5100,7.0000,0.0000,0.0000,6.5100,7.0000,7.0000,0.0000,6.5100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,16.9000,-11.2000,6.6500,7.0000,0.0000,-0.0000,6.6500,7.0000,7.0000,0.0000,6.6500,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,17.0400,-11.2000,6.7900,7.0000,0.0000,-0.0000,6.7900,7.0000,7.0000,0.0000,6.7900,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,17.1800,-11.2000,6.9300,7.0000,0.0000,0.0000,6.9300,7.0000,7.0000,0.0000,6.9300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.3200,-11.2000,7.0700,7.0000,0.0000,0.0000,7.0700,7.0000,7.0000,0.0000,7.0700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.4600,-11.2000,7.2100,7.0000,0.0000,0.0000,7.2100,7.0000,7.0000,0.0000,7.2100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.6000,-11.2000,7.3500,7.0000,0.0000,0.0000,7.3500,7.0000,7.0000,0.0000,7.3500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.7400,-11.2000,7.4900,7.0000,-0.0000,-0.0000,7.4900,7.0000,7.0000,0.0000,7.4900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,17.8800,-11.2000,7.6300,7.0000,0.0000,0.0000,7.6300,7.0000,7.0000,0.0000,7.6300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.0200,-11.2000,7.7700,7.0000,0.0000,0.0000,7.7700,7.0000,7.0000,0.0000,7.7700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.1600,-11.2000,7.9100,7.0000,0.0000,0.0000,7.9100,7.0000,7.0000,0.0000,7.9100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.3000,-11.2000,8.0500,7.0000,0.0000,0.0000,8.0500,7.0000,7.0000,0.0000,8.0500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.4400,-11.2000,8.1900,7.0000,0.0000,0.0000,8.1900,7.0000,7.0000,0.0000,8.1900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.5800,-11.2000,8.3300,7.0000,0.0000,0.0000,8.3300,7.0000,7.0000,0.0000,8.3300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.7200,-11.2000,8.4700,7.0000,-0.0000,-0.0000,8.4700,7.0000,7.0000,0.0000,8.4700,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,18.8600,-11.2000,8.6100,7.0000,0.0000,0.0000,8.6100,7.0000,7.0000,0.0000,8.6100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.0000,-11.2000,8.7500,7.0000,0.0000,0.0000,8.7500,7.0000,7.0000,0.0000,8.7500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.1400,-11.2000,8.8900,7.0000,-0.0000,-0.0000,8.8900,7.0000,7.0000,0.0000,8.8900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,19.2800,-11.2000,9.0300,7.0000,0.0000,0.0000,9.0300,7.0000,7.0000,0.0000,9.0300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.4200,-11.2000,9.1700,7.0000,0.0000,0.0000,9.1700,7.0000,7.0000,0.0000,9.1700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.5600,-11.2000,9.3100,7.0000,-0.0000,-0.0000,9.3100,7.0000,7.0000,0.0000,9.3100,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,19.6972,-11.2000,9.4472,6.8600,-7.0000,-350.0000,9.4472,6.8600,-7.0000,0.0000,9.4472,6.8600,-7.0000,-350.0000,0.0000},
				{0.0200,19.8316,-11.2000,9.5816,6.7200,-7.0000,0.0000,9.5816,6.7200,-7.0000,0.0000,9.5816,6.7200,-7.0000,0.0000,0.0000},
				{0.0200,19.9632,-11.2000,9.7132,6.5800,-7.0000,-0.0000,9.7132,6.5800,-7.0000,0.0000,9.7132,6.5800,-7.0000,-0.0000,0.0000},
				{0.0200,20.0920,-11.2000,9.8420,6.4400,-7.0000,0.0000,9.8420,6.4400,-7.0000,0.0000,9.8420,6.4400,-7.0000,0.0000,0.0000},
				{0.0200,20.2180,-11.2000,9.9680,6.3000,-7.0000,-0.0000,9.9680,6.3000,-7.0000,0.0000,9.9680,6.3000,-7.0000,-0.0000,0.0000},
				{0.0200,20.3412,-11.2000,10.0912,6.1600,-7.0000,0.0000,10.0912,6.1600,-7.0000,0.0000,10.0912,6.1600,-7.0000,0.0000,0.0000},
				{0.0200,20.4616,-11.2000,10.2116,6.0200,-7.0000,0.0000,10.2116,6.0200,-7.0000,0.0000,10.2116,6.0200,-7.0000,0.0000,0.0000},
				{0.0200,20.5792,-11.2000,10.3292,5.8800,-7.0000,-0.0000,10.3292,5.8800,-7.0000,0.0000,10.3292,5.8800,-7.0000,-0.0000,0.0000},
				{0.0200,20.6940,-11.2000,10.4440,5.7400,-7.0000,0.0000,10.4440,5.7400,-7.0000,0.0000,10.4440,5.7400,-7.0000,0.0000,0.0000},
				{0.0200,20.8060,-11.2000,10.5560,5.6000,-7.0000,-0.0000,10.5560,5.6000,-7.0000,0.0000,10.5560,5.6000,-7.0000,-0.0000,0.0000},
				{0.0200,20.9152,-11.2000,10.6652,5.4600,-7.0000,0.0000,10.6652,5.4600,-7.0000,0.0000,10.6652,5.4600,-7.0000,0.0000,0.0000},
				{0.0200,21.0216,-11.2000,10.7716,5.3200,-7.0000,0.0000,10.7716,5.3200,-7.0000,0.0000,10.7716,5.3200,-7.0000,0.0000,0.0000},
				{0.0200,21.1252,-11.2000,10.8752,5.1800,-7.0000,0.0000,10.8752,5.1800,-7.0000,0.0000,10.8752,5.1800,-7.0000,0.0000,0.0000},
				{0.0200,21.2260,-11.2000,10.9760,5.0400,-7.0000,-0.0000,10.9760,5.0400,-7.0000,0.0000,10.9760,5.0400,-7.0000,-0.0000,0.0000},
				{0.0200,21.3240,-11.2000,11.0740,4.9000,-7.0000,0.0000,11.0740,4.9000,-7.0000,0.0000,11.0740,4.9000,-7.0000,0.0000,0.0000},
				{0.0200,21.4192,-11.2000,11.1692,4.7600,-7.0000,-0.0000,11.1692,4.7600,-7.0000,0.0000,11.1692,4.7600,-7.0000,-0.0000,0.0000},
				{0.0200,21.5116,-11.2000,11.2616,4.6200,-7.0000,0.0000,11.2616,4.6200,-7.0000,0.0000,11.2616,4.6200,-7.0000,0.0000,0.0000},
				{0.0200,21.6012,-11.2000,11.3512,4.4800,-7.0000,-0.0000,11.3512,4.4800,-7.0000,0.0000,11.3512,4.4800,-7.0000,-0.0000,0.0000},
				{0.0200,21.6880,-11.2000,11.4380,4.3400,-7.0000,0.0000,11.4380,4.3400,-7.0000,0.0000,11.4380,4.3400,-7.0000,0.0000,0.0000},
				{0.0200,21.7720,-11.2000,11.5220,4.2000,-7.0000,0.0000,11.5220,4.2000,-7.0000,0.0000,11.5220,4.2000,-7.0000,0.0000,0.0000},
				{0.0200,21.8532,-11.2000,11.6032,4.0600,-7.0000,0.0000,11.6032,4.0600,-7.0000,0.0000,11.6032,4.0600,-7.0000,0.0000,0.0000},
				{0.0200,21.9316,-11.2000,11.6816,3.9200,-7.0000,-0.0000,11.6816,3.9200,-7.0000,0.0000,11.6816,3.9200,-7.0000,-0.0000,0.0000},
				{0.0200,22.0072,-11.2000,11.7572,3.7800,-7.0000,0.0000,11.7572,3.7800,-7.0000,0.0000,11.7572,3.7800,-7.0000,0.0000,0.0000},
				{0.0200,22.0800,-11.2000,11.8300,3.6400,-7.0000,0.0000,11.8300,3.6400,-7.0000,0.0000,11.8300,3.6400,-7.0000,0.0000,0.0000},
				{0.0200,22.1500,-11.2000,11.9000,3.5000,-7.0000,-0.0000,11.9000,3.5000,-7.0000,0.0000,11.9000,3.5000,-7.0000,-0.0000,0.0000},
				{0.0200,22.2172,-11.2000,11.9672,3.3600,-7.0000,0.0000,11.9672,3.3600,-7.0000,0.0000,11.9672,3.3600,-7.0000,0.0000,0.0000},
				{0.0200,22.2816,-11.2000,12.0316,3.2200,-7.0000,-0.0000,12.0316,3.2200,-7.0000,0.0000,12.0316,3.2200,-7.0000,-0.0000,0.0000},
				{0.0200,22.3432,-11.2000,12.0932,3.0800,-7.0000,0.0000,12.0932,3.0800,-7.0000,0.0000,12.0932,3.0800,-7.0000,0.0000,0.0000},
				{0.0200,22.4020,-11.2000,12.1520,2.9400,-7.0000,-0.0000,12.1520,2.9400,-7.0000,0.0000,12.1520,2.9400,-7.0000,-0.0000,0.0000},
				{0.0200,22.4580,-11.2000,12.2080,2.8000,-7.0000,0.0000,12.2080,2.8000,-7.0000,0.0000,12.2080,2.8000,-7.0000,0.0000,0.0000},
				{0.0200,22.5112,-11.2000,12.2612,2.6600,-7.0000,-0.0000,12.2612,2.6600,-7.0000,0.0000,12.2612,2.6600,-7.0000,-0.0000,0.0000},
				{0.0200,22.5616,-11.2000,12.3116,2.5200,-7.0000,0.0000,12.3116,2.5200,-7.0000,0.0000,12.3116,2.5200,-7.0000,0.0000,0.0000},
				{0.0200,22.6092,-11.2000,12.3592,2.3800,-7.0000,0.0000,12.3592,2.3800,-7.0000,0.0000,12.3592,2.3800,-7.0000,0.0000,0.0000},
				{0.0200,22.6540,-11.2000,12.4040,2.2400,-7.0000,-0.0000,12.4040,2.2400,-7.0000,0.0000,12.4040,2.2400,-7.0000,-0.0000,0.0000},
				{0.0200,22.6960,-11.2000,12.4460,2.1000,-7.0000,0.0000,12.4460,2.1000,-7.0000,0.0000,12.4460,2.1000,-7.0000,0.0000,0.0000},
				{0.0200,22.7352,-11.2000,12.4852,1.9600,-7.0000,0.0000,12.4852,1.9600,-7.0000,0.0000,12.4852,1.9600,-7.0000,0.0000,0.0000},
				{0.0200,22.7716,-11.2000,12.5216,1.8200,-7.0000,0.0000,12.5216,1.8200,-7.0000,0.0000,12.5216,1.8200,-7.0000,0.0000,0.0000},
				{0.0200,22.8052,-11.2000,12.5552,1.6800,-7.0000,-0.0000,12.5552,1.6800,-7.0000,0.0000,12.5552,1.6800,-7.0000,-0.0000,0.0000},
				{0.0200,22.8360,-11.2000,12.5860,1.5400,-7.0000,0.0000,12.5860,1.5400,-7.0000,0.0000,12.5860,1.5400,-7.0000,0.0000,0.0000},
				{0.0200,22.8640,-11.2000,12.6140,1.4000,-7.0000,-0.0000,12.6140,1.4000,-7.0000,0.0000,12.6140,1.4000,-7.0000,-0.0000,0.0000},
				{0.0200,22.8892,-11.2000,12.6392,1.2600,-7.0000,0.0000,12.6392,1.2600,-7.0000,0.0000,12.6392,1.2600,-7.0000,0.0000,0.0000},
				{0.0200,22.9116,-11.2000,12.6616,1.1200,-7.0000,-0.0000,12.6616,1.1200,-7.0000,0.0000,12.6616,1.1200,-7.0000,-0.0000,0.0000},
				{0.0200,22.9312,-11.2000,12.6812,0.9800,-7.0000,0.0000,12.6812,0.9800,-7.0000,0.0000,12.6812,0.9800,-7.0000,0.0000,0.0000},
				{0.0200,22.9480,-11.2000,12.6980,0.8400,-7.0000,-0.0000,12.6980,0.8400,-7.0000,0.0000,12.6980,0.8400,-7.0000,-0.0000,0.0000},
				{0.0200,22.9620,-11.2000,12.7120,0.7000,-7.0000,-0.0000,12.7120,0.7000,-7.0000,0.0000,12.7120,0.7000,-7.0000,-0.0000,0.0000},
				{0.0200,22.9732,-11.2000,12.7232,0.5600,-7.0000,0.0000,12.7232,0.5600,-7.0000,0.0000,12.7232,0.5600,-7.0000,0.0000,0.0000},
				{0.0200,22.9816,-11.2000,12.7316,0.4200,-7.0000,-0.0000,12.7316,0.4200,-7.0000,0.0000,12.7316,0.4200,-7.0000,-0.0000,0.0000},
				{0.0200,22.9872,-11.2000,12.7372,0.2800,-7.0000,0.0000,12.7372,0.2800,-7.0000,0.0000,12.7372,0.2800,-7.0000,0.0000,0.0000},
				{0.0200,22.9900,-11.2000,12.7400,0.1400,-7.0000,0.0000,12.7400,0.1400,-7.0000,0.0000,12.7400,0.1400,-7.0000,0.0000,0.0000},
				{0.0200,22.9900,-11.2000,12.7400,0.0000,-7.0000,-0.0000,12.7400,0.0000,-7.0000,0.0000,12.7400,0.0000,-7.0000,-0.0000,0.0000},
				{0.0200,22.9872,-11.2000,12.7428,0.1400,7.0000,700.0000,12.7372,-0.1400,-7.0000,0.0000,12.7428,0.1400,7.0000,700.0000,0.0000},

	    };

	@Override
	public double[][] getPath() {
	    return points;
	}
}