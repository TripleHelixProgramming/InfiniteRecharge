package frc.paths;

import com.team319.trajectory.Path;

public class RightSweep extends Path {
   // dt,x,y,left.pos,left.vel,left.acc,left.jerk,center.pos,center.vel,center.acc,center.jerk,right.pos,right.vel,right.acc,right.jerk,heading
	private static final double[][] points = {
				{0.0200,12.4028,-11.2000,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,0.0000},
				{0.0200,12.4084,-11.2000,0.0084,0.2800,7.0000,-0.0000,0.0084,0.2800,7.0000,0.0000,0.0084,0.2800,7.0000,-0.0000,0.0000},
				{0.0200,12.4168,-11.2000,0.0168,0.4200,7.0000,0.0000,0.0168,0.4200,7.0000,0.0000,0.0168,0.4200,7.0000,0.0000,0.0000},
				{0.0200,12.4280,-11.2000,0.0280,0.5600,7.0000,0.0000,0.0280,0.5600,7.0000,0.0000,0.0280,0.5600,7.0000,0.0000,0.0000},
				{0.0200,12.4420,-11.2000,0.0420,0.7000,7.0000,-0.0000,0.0420,0.7000,7.0000,0.0000,0.0420,0.7000,7.0000,-0.0000,0.0000},
				{0.0200,12.4588,-11.2000,0.0588,0.8400,7.0000,0.0000,0.0588,0.8400,7.0000,0.0000,0.0588,0.8400,7.0000,0.0000,0.0000},
				{0.0200,12.4784,-11.2000,0.0784,0.9800,7.0000,0.0000,0.0784,0.9800,7.0000,0.0000,0.0784,0.9800,7.0000,0.0000,0.0000},
				{0.0200,12.5008,-11.2000,0.1008,1.1200,7.0000,-0.0000,0.1008,1.1200,7.0000,0.0000,0.1008,1.1200,7.0000,-0.0000,0.0000},
				{0.0200,12.5260,-11.2000,0.1260,1.2600,7.0000,0.0000,0.1260,1.2600,7.0000,0.0000,0.1260,1.2600,7.0000,0.0000,0.0000},
				{0.0200,12.5540,-11.2000,0.1540,1.4000,7.0000,0.0000,0.1540,1.4000,7.0000,0.0000,0.1540,1.4000,7.0000,0.0000,0.0000},
				{0.0200,12.5848,-11.2000,0.1848,1.5400,7.0000,-0.0000,0.1848,1.5400,7.0000,0.0000,0.1848,1.5400,7.0000,-0.0000,0.0000},
				{0.0200,12.6184,-11.2000,0.2184,1.6800,7.0000,0.0000,0.2184,1.6800,7.0000,0.0000,0.2184,1.6800,7.0000,0.0000,0.0000},
				{0.0200,12.6548,-11.2000,0.2548,1.8200,7.0000,-0.0000,0.2548,1.8200,7.0000,0.0000,0.2548,1.8200,7.0000,-0.0000,0.0000},
				{0.0200,12.6940,-11.2000,0.2940,1.9600,7.0000,0.0000,0.2940,1.9600,7.0000,0.0000,0.2940,1.9600,7.0000,0.0000,0.0000},
				{0.0200,12.7360,-11.2000,0.3360,2.1000,7.0000,-0.0000,0.3360,2.1000,7.0000,0.0000,0.3360,2.1000,7.0000,-0.0000,0.0000},
				{0.0200,12.7808,-11.2000,0.3808,2.2400,7.0000,-0.0000,0.3808,2.2400,7.0000,0.0000,0.3808,2.2400,7.0000,-0.0000,0.0000},
				{0.0200,12.8284,-11.2000,0.4284,2.3800,7.0000,0.0000,0.4284,2.3800,7.0000,0.0000,0.4284,2.3800,7.0000,0.0000,0.0000},
				{0.0200,12.8788,-11.2000,0.4788,2.5200,7.0000,0.0000,0.4788,2.5200,7.0000,0.0000,0.4788,2.5200,7.0000,0.0000,0.0000},
				{0.0200,12.9320,-11.2000,0.5320,2.6600,7.0000,0.0000,0.5320,2.6600,7.0000,0.0000,0.5320,2.6600,7.0000,0.0000,0.0000},
				{0.0200,12.9880,-11.2000,0.5880,2.8000,7.0000,-0.0000,0.5880,2.8000,7.0000,0.0000,0.5880,2.8000,7.0000,-0.0000,0.0000},
				{0.0200,13.0468,-11.2000,0.6468,2.9400,7.0000,0.0000,0.6468,2.9400,7.0000,0.0000,0.6468,2.9400,7.0000,0.0000,0.0000},
				{0.0200,13.1084,-11.2000,0.7084,3.0800,7.0000,0.0000,0.7084,3.0800,7.0000,0.0000,0.7084,3.0800,7.0000,0.0000,0.0000},
				{0.0200,13.1728,-11.2000,0.7728,3.2200,7.0000,-0.0000,0.7728,3.2200,7.0000,0.0000,0.7728,3.2200,7.0000,-0.0000,0.0000},
				{0.0200,13.2400,-11.2000,0.8400,3.3600,7.0000,-0.0000,0.8400,3.3600,7.0000,0.0000,0.8400,3.3600,7.0000,-0.0000,0.0000},
				{0.0200,13.3100,-11.2000,0.9100,3.5000,7.0000,0.0000,0.9100,3.5000,7.0000,0.0000,0.9100,3.5000,7.0000,0.0000,0.0000},
				{0.0200,13.3828,-11.2000,0.9828,3.6400,7.0000,0.0000,0.9828,3.6400,7.0000,0.0000,0.9828,3.6400,7.0000,0.0000,0.0000},
				{0.0200,13.4584,-11.2000,1.0584,3.7800,7.0000,0.0000,1.0584,3.7800,7.0000,0.0000,1.0584,3.7800,7.0000,0.0000,0.0000},
				{0.0200,13.5368,-11.2000,1.1368,3.9200,7.0000,-0.0000,1.1368,3.9200,7.0000,0.0000,1.1368,3.9200,7.0000,-0.0000,0.0000},
				{0.0200,13.6180,-11.2000,1.2180,4.0600,7.0000,0.0000,1.2180,4.0600,7.0000,0.0000,1.2180,4.0600,7.0000,0.0000,0.0000},
				{0.0200,13.7020,-11.2000,1.3020,4.2000,7.0000,0.0000,1.3020,4.2000,7.0000,0.0000,1.3020,4.2000,7.0000,0.0000,0.0000},
				{0.0200,13.7888,-11.2000,1.3888,4.3400,7.0000,-0.0000,1.3888,4.3400,7.0000,0.0000,1.3888,4.3400,7.0000,-0.0000,0.0000},
				{0.0200,13.8784,-11.2000,1.4784,4.4800,7.0000,0.0000,1.4784,4.4800,7.0000,0.0000,1.4784,4.4800,7.0000,0.0000,0.0000},
				{0.0200,13.9708,-11.2000,1.5708,4.6200,7.0000,0.0000,1.5708,4.6200,7.0000,0.0000,1.5708,4.6200,7.0000,0.0000,0.0000},
				{0.0200,14.0660,-11.2000,1.6660,4.7600,7.0000,0.0000,1.6660,4.7600,7.0000,0.0000,1.6660,4.7600,7.0000,0.0000,0.0000},
				{0.0200,14.1640,-11.2000,1.7640,4.9000,7.0000,-0.0000,1.7640,4.9000,7.0000,0.0000,1.7640,4.9000,7.0000,-0.0000,0.0000},
				{0.0200,14.2648,-11.2000,1.8648,5.0400,7.0000,0.0000,1.8648,5.0400,7.0000,0.0000,1.8648,5.0400,7.0000,0.0000,0.0000},
				{0.0200,14.3684,-11.2000,1.9684,5.1800,7.0000,0.0000,1.9684,5.1800,7.0000,0.0000,1.9684,5.1800,7.0000,0.0000,0.0000},
				{0.0200,14.4748,-11.2000,2.0748,5.3200,7.0000,-0.0000,2.0748,5.3200,7.0000,0.0000,2.0748,5.3200,7.0000,-0.0000,0.0000},
				{0.0200,14.5840,-11.2000,2.1840,5.4600,7.0000,0.0000,2.1840,5.4600,7.0000,0.0000,2.1840,5.4600,7.0000,0.0000,0.0000},
				{0.0200,14.6960,-11.2000,2.2960,5.6000,7.0000,0.0000,2.2960,5.6000,7.0000,0.0000,2.2960,5.6000,7.0000,0.0000,0.0000},
				{0.0200,14.8108,-11.2000,2.4108,5.7400,7.0000,-0.0000,2.4108,5.7400,7.0000,0.0000,2.4108,5.7400,7.0000,-0.0000,0.0000},
				{0.0200,14.9284,-11.2000,2.5284,5.8800,7.0000,0.0000,2.5284,5.8800,7.0000,0.0000,2.5284,5.8800,7.0000,0.0000,0.0000},
				{0.0200,15.0488,-11.2000,2.6488,6.0200,7.0000,0.0000,2.6488,6.0200,7.0000,0.0000,2.6488,6.0200,7.0000,0.0000,0.0000},
				{0.0200,15.1720,-11.2000,2.7720,6.1600,7.0000,-0.0000,2.7720,6.1600,7.0000,0.0000,2.7720,6.1600,7.0000,-0.0000,0.0000},
				{0.0200,15.2980,-11.2000,2.8980,6.3000,7.0000,0.0000,2.8980,6.3000,7.0000,0.0000,2.8980,6.3000,7.0000,0.0000,0.0000},
				{0.0200,15.4268,-11.2000,3.0268,6.4400,7.0000,0.0000,3.0268,6.4400,7.0000,0.0000,3.0268,6.4400,7.0000,0.0000,0.0000},
				{0.0200,15.5584,-11.2000,3.1584,6.5800,7.0000,-0.0000,3.1584,6.5800,7.0000,0.0000,3.1584,6.5800,7.0000,-0.0000,0.0000},
				{0.0200,15.6928,-11.2000,3.2928,6.7200,7.0000,0.0000,3.2928,6.7200,7.0000,0.0000,3.2928,6.7200,7.0000,0.0000,0.0000},
				{0.0200,15.8300,-11.2000,3.4300,6.8600,7.0000,0.0000,3.4300,6.8600,7.0000,0.0000,3.4300,6.8600,7.0000,0.0000,0.0000},
				{0.0200,15.9700,-11.2000,3.5700,7.0000,7.0000,-0.0000,3.5700,7.0000,7.0000,0.0000,3.5700,7.0000,7.0000,-0.0000,0.0000},
				{0.0200,16.1100,-11.2000,3.7100,7.0000,0.0000,-350.0000,3.7100,7.0000,7.0000,0.0000,3.7100,7.0000,0.0000,-350.0000,0.0000},
				{0.0200,16.2500,-11.2000,3.8500,7.0000,-0.0000,-0.0000,3.8500,7.0000,7.0000,0.0000,3.8500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,16.3900,-11.2000,3.9900,7.0000,0.0000,0.0000,3.9900,7.0000,7.0000,0.0000,3.9900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,16.5300,-11.2000,4.1300,7.0000,-0.0000,-0.0000,4.1300,7.0000,7.0000,0.0000,4.1300,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,16.6700,-11.2000,4.2700,7.0000,0.0000,0.0000,4.2700,7.0000,7.0000,0.0000,4.2700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,16.8100,-11.2000,4.4100,7.0000,-0.0000,-0.0000,4.4100,7.0000,7.0000,0.0000,4.4100,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,16.9500,-11.2000,4.5500,7.0000,0.0000,0.0000,4.5500,7.0000,7.0000,0.0000,4.5500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.0900,-11.2000,4.6900,7.0000,0.0000,0.0000,4.6900,7.0000,7.0000,0.0000,4.6900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.2300,-11.2000,4.8300,7.0000,-0.0000,-0.0000,4.8300,7.0000,7.0000,0.0000,4.8300,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,17.3700,-11.2000,4.9700,7.0000,0.0000,0.0000,4.9700,7.0000,7.0000,0.0000,4.9700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.5100,-11.2000,5.1100,7.0000,-0.0000,-0.0000,5.1100,7.0000,7.0000,0.0000,5.1100,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,17.6500,-11.2000,5.2500,7.0000,0.0000,0.0000,5.2500,7.0000,7.0000,0.0000,5.2500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.7900,-11.2000,5.3900,7.0000,0.0000,0.0000,5.3900,7.0000,7.0000,0.0000,5.3900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,17.9300,-11.2000,5.5300,7.0000,0.0000,-0.0000,5.5300,7.0000,7.0000,0.0000,5.5300,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,18.0700,-11.2000,5.6700,7.0000,0.0000,-0.0000,5.6700,7.0000,7.0000,0.0000,5.6700,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,18.2100,-11.2000,5.8100,7.0000,0.0000,0.0000,5.8100,7.0000,7.0000,0.0000,5.8100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.3500,-11.2000,5.9500,7.0000,0.0000,0.0000,5.9500,7.0000,7.0000,0.0000,5.9500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.4900,-11.2000,6.0900,7.0000,-0.0000,-0.0000,6.0900,7.0000,7.0000,0.0000,6.0900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,18.6300,-11.2000,6.2300,7.0000,0.0000,0.0000,6.2300,7.0000,7.0000,0.0000,6.2300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.7700,-11.2000,6.3700,7.0000,0.0000,0.0000,6.3700,7.0000,7.0000,0.0000,6.3700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,18.9100,-11.2000,6.5100,7.0000,0.0000,0.0000,6.5100,7.0000,7.0000,0.0000,6.5100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.0500,-11.2000,6.6500,7.0000,0.0000,0.0000,6.6500,7.0000,7.0000,0.0000,6.6500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.1900,-11.2000,6.7900,7.0000,0.0000,0.0000,6.7900,7.0000,7.0000,0.0000,6.7900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.3300,-11.2000,6.9300,7.0000,0.0000,0.0000,6.9300,7.0000,7.0000,0.0000,6.9300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.4700,-11.2000,7.0700,7.0000,0.0000,0.0000,7.0700,7.0000,7.0000,0.0000,7.0700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.6100,-11.2000,7.2100,7.0000,0.0000,0.0000,7.2100,7.0000,7.0000,0.0000,7.2100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,19.7472,-11.2000,7.3472,6.8600,-7.0000,-350.0000,7.3472,6.8600,-7.0000,0.0000,7.3472,6.8600,-7.0000,-350.0000,0.0000},
				{0.0200,19.8816,-11.2000,7.4816,6.7200,-7.0000,0.0000,7.4816,6.7200,-7.0000,0.0000,7.4816,6.7200,-7.0000,0.0000,0.0000},
				{0.0200,20.0132,-11.2000,7.6132,6.5800,-7.0000,-0.0000,7.6132,6.5800,-7.0000,0.0000,7.6132,6.5800,-7.0000,-0.0000,0.0000},
				{0.0200,20.1420,-11.2000,7.7420,6.4400,-7.0000,0.0000,7.7420,6.4400,-7.0000,0.0000,7.7420,6.4400,-7.0000,0.0000,0.0000},
				{0.0200,20.2680,-11.2000,7.8680,6.3000,-7.0000,-0.0000,7.8680,6.3000,-7.0000,0.0000,7.8680,6.3000,-7.0000,-0.0000,0.0000},
				{0.0200,20.3912,-11.2000,7.9912,6.1600,-7.0000,0.0000,7.9912,6.1600,-7.0000,0.0000,7.9912,6.1600,-7.0000,0.0000,0.0000},
				{0.0200,20.5116,-11.2000,8.1116,6.0200,-7.0000,0.0000,8.1116,6.0200,-7.0000,0.0000,8.1116,6.0200,-7.0000,0.0000,0.0000},
				{0.0200,20.6292,-11.2000,8.2292,5.8800,-7.0000,-0.0000,8.2292,5.8800,-7.0000,0.0000,8.2292,5.8800,-7.0000,-0.0000,0.0000},
				{0.0200,20.7440,-11.2000,8.3440,5.7400,-7.0000,0.0000,8.3440,5.7400,-7.0000,0.0000,8.3440,5.7400,-7.0000,0.0000,0.0000},
				{0.0200,20.8560,-11.2000,8.4560,5.6000,-7.0000,0.0000,8.4560,5.6000,-7.0000,0.0000,8.4560,5.6000,-7.0000,0.0000,0.0000},
				{0.0200,20.9652,-11.2000,8.5652,5.4600,-7.0000,-0.0000,8.5652,5.4600,-7.0000,0.0000,8.5652,5.4600,-7.0000,-0.0000,0.0000},
				{0.0200,21.0716,-11.2000,8.6716,5.3200,-7.0000,0.0000,8.6716,5.3200,-7.0000,0.0000,8.6716,5.3200,-7.0000,0.0000,0.0000},
				{0.0200,21.1752,-11.2000,8.7752,5.1800,-7.0000,0.0000,8.7752,5.1800,-7.0000,0.0000,8.7752,5.1800,-7.0000,0.0000,0.0000},
				{0.0200,21.2760,-11.2000,8.8760,5.0400,-7.0000,-0.0000,8.8760,5.0400,-7.0000,0.0000,8.8760,5.0400,-7.0000,-0.0000,0.0000},
				{0.0200,21.3740,-11.2000,8.9740,4.9000,-7.0000,0.0000,8.9740,4.9000,-7.0000,0.0000,8.9740,4.9000,-7.0000,0.0000,0.0000},
				{0.0200,21.4692,-11.2000,9.0692,4.7600,-7.0000,0.0000,9.0692,4.7600,-7.0000,0.0000,9.0692,4.7600,-7.0000,0.0000,0.0000},
				{0.0200,21.5616,-11.2000,9.1616,4.6200,-7.0000,-0.0000,9.1616,4.6200,-7.0000,0.0000,9.1616,4.6200,-7.0000,-0.0000,0.0000},
				{0.0200,21.6512,-11.2000,9.2512,4.4800,-7.0000,0.0000,9.2512,4.4800,-7.0000,0.0000,9.2512,4.4800,-7.0000,0.0000,0.0000},
				{0.0200,21.7380,-11.2000,9.3380,4.3400,-7.0000,-0.0000,9.3380,4.3400,-7.0000,0.0000,9.3380,4.3400,-7.0000,-0.0000,0.0000},
				{0.0200,21.8220,-11.2000,9.4220,4.2000,-7.0000,0.0000,9.4220,4.2000,-7.0000,0.0000,9.4220,4.2000,-7.0000,0.0000,0.0000},
				{0.0200,21.9032,-11.2000,9.5032,4.0600,-7.0000,0.0000,9.5032,4.0600,-7.0000,0.0000,9.5032,4.0600,-7.0000,0.0000,0.0000},
				{0.0200,21.9816,-11.2000,9.5816,3.9200,-7.0000,-0.0000,9.5816,3.9200,-7.0000,0.0000,9.5816,3.9200,-7.0000,-0.0000,0.0000},
				{0.0200,22.0572,-11.2000,9.6572,3.7800,-7.0000,0.0000,9.6572,3.7800,-7.0000,0.0000,9.6572,3.7800,-7.0000,0.0000,0.0000},
				{0.0200,22.1300,-11.2000,9.7300,3.6400,-7.0000,0.0000,9.7300,3.6400,-7.0000,0.0000,9.7300,3.6400,-7.0000,0.0000,0.0000},
				{0.0200,22.2000,-11.2000,9.8000,3.5000,-7.0000,-0.0000,9.8000,3.5000,-7.0000,0.0000,9.8000,3.5000,-7.0000,-0.0000,0.0000},
				{0.0200,22.2672,-11.2000,9.8672,3.3600,-7.0000,0.0000,9.8672,3.3600,-7.0000,0.0000,9.8672,3.3600,-7.0000,0.0000,0.0000},
				{0.0200,22.3316,-11.2000,9.9316,3.2200,-7.0000,0.0000,9.9316,3.2200,-7.0000,0.0000,9.9316,3.2200,-7.0000,0.0000,0.0000},
				{0.0200,22.3932,-11.2000,9.9932,3.0800,-7.0000,0.0000,9.9932,3.0800,-7.0000,0.0000,9.9932,3.0800,-7.0000,0.0000,0.0000},
				{0.0200,22.4520,-11.2000,10.0520,2.9400,-7.0000,-0.0000,10.0520,2.9400,-7.0000,0.0000,10.0520,2.9400,-7.0000,-0.0000,0.0000},
				{0.0200,22.5080,-11.2000,10.1080,2.8000,-7.0000,0.0000,10.1080,2.8000,-7.0000,0.0000,10.1080,2.8000,-7.0000,0.0000,0.0000},
				{0.0200,22.5612,-11.2000,10.1612,2.6600,-7.0000,0.0000,10.1612,2.6600,-7.0000,0.0000,10.1612,2.6600,-7.0000,0.0000,0.0000},
				{0.0200,22.6116,-11.2000,10.2116,2.5200,-7.0000,-0.0000,10.2116,2.5200,-7.0000,0.0000,10.2116,2.5200,-7.0000,-0.0000,0.0000},
				{0.0200,22.6592,-11.2000,10.2592,2.3800,-7.0000,0.0000,10.2592,2.3800,-7.0000,0.0000,10.2592,2.3800,-7.0000,0.0000,0.0000},
				{0.0200,22.7040,-11.2000,10.3040,2.2400,-7.0000,-0.0000,10.3040,2.2400,-7.0000,0.0000,10.3040,2.2400,-7.0000,-0.0000,0.0000},
				{0.0200,22.7460,-11.2000,10.3460,2.1000,-7.0000,0.0000,10.3460,2.1000,-7.0000,0.0000,10.3460,2.1000,-7.0000,0.0000,0.0000},
				{0.0200,22.7852,-11.2000,10.3852,1.9600,-7.0000,-0.0000,10.3852,1.9600,-7.0000,0.0000,10.3852,1.9600,-7.0000,-0.0000,0.0000},
				{0.0200,22.8216,-11.2000,10.4216,1.8200,-7.0000,0.0000,10.4216,1.8200,-7.0000,0.0000,10.4216,1.8200,-7.0000,0.0000,0.0000},
				{0.0200,22.8552,-11.2000,10.4552,1.6800,-7.0000,0.0000,10.4552,1.6800,-7.0000,0.0000,10.4552,1.6800,-7.0000,0.0000,0.0000},
				{0.0200,22.8860,-11.2000,10.4860,1.5400,-7.0000,-0.0000,10.4860,1.5400,-7.0000,0.0000,10.4860,1.5400,-7.0000,-0.0000,0.0000},
				{0.0200,22.9140,-11.2000,10.5140,1.4000,-7.0000,0.0000,10.5140,1.4000,-7.0000,0.0000,10.5140,1.4000,-7.0000,0.0000,0.0000},
				{0.0200,22.9392,-11.2000,10.5392,1.2600,-7.0000,-0.0000,10.5392,1.2600,-7.0000,0.0000,10.5392,1.2600,-7.0000,-0.0000,0.0000},
				{0.0200,22.9616,-11.2000,10.5616,1.1200,-7.0000,0.0000,10.5616,1.1200,-7.0000,0.0000,10.5616,1.1200,-7.0000,0.0000,0.0000},
				{0.0200,22.9812,-11.2000,10.5812,0.9800,-7.0000,0.0000,10.5812,0.9800,-7.0000,0.0000,10.5812,0.9800,-7.0000,0.0000,0.0000},
				{0.0200,22.9980,-11.2000,10.5980,0.8400,-7.0000,0.0000,10.5980,0.8400,-7.0000,0.0000,10.5980,0.8400,-7.0000,0.0000,0.0000},
				{0.0200,23.0000,-11.2000,10.6000,0.1000,-37.0000,-1500.0000,10.6000,0.7000,-7.0000,0.0000,10.6000,0.1000,-37.0000,-1500.0000,0.0000},
				{0.0200,23.0000,-11.2000,10.6000,0.0000,-5.0000,1600.0000,10.6000,0.5600,-7.0000,0.0000,10.6000,0.0000,-5.0000,1600.0000,0.0000},
				{0.0200,23.0000,-11.2000,10.6000,0.0000,0.0000,250.0000,10.6000,0.4200,-7.0000,0.0000,10.6000,0.0000,0.0000,250.0000,0.0000},
				{0.0200,23.0000,-11.2000,10.6000,0.0000,0.0000,0.0000,10.6000,0.2800,-7.0000,0.0000,10.6000,0.0000,0.0000,0.0000,0.0000},
				{0.0200,23.0000,-11.2000,10.6000,0.0000,0.0000,0.0000,10.6000,0.1400,-7.0000,0.0000,10.6000,0.0000,0.0000,0.0000,0.0000},
				{0.0200,23.0000,-11.2000,10.6000,0.0000,0.0000,0.0000,10.6000,0.0000,-7.0000,0.0000,10.6000,0.0000,0.0000,0.0000,0.0000},
				{0.0200,23.0000,-11.2000,10.6000,0.0000,0.0000,0.0000,10.6000,-0.1400,-7.0000,0.0000,10.6000,0.0000,0.0000,0.0000,0.0000},

	    };

	@Override
	public double[][] getPath() {
	    return points;
	}
}