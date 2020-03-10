package frc.paths;

import com.team319.trajectory.Path;

public class LayupAutoPartTwo extends Path {
   // dt,x,y,left.pos,left.vel,left.acc,left.jerk,center.pos,center.vel,center.acc,center.jerk,right.pos,right.vel,right.acc,right.jerk,heading
	private static final double[][] points = {
				{0.0200,20.0028,-11.2000,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,0.0028,0.1400,7.0000,0.0000,0.0000},
				{0.0200,20.0084,-11.2000,0.0084,0.2800,7.0000,0.0000,0.0084,0.2800,7.0000,0.0000,0.0084,0.2800,7.0000,0.0000,0.0000},
				{0.0200,20.0168,-11.2000,0.0168,0.4200,7.0000,-0.0000,0.0168,0.4200,7.0000,0.0000,0.0168,0.4200,7.0000,-0.0000,0.0000},
				{0.0200,20.0280,-11.2000,0.0280,0.5600,7.0000,0.0000,0.0280,0.5600,7.0000,0.0000,0.0280,0.5600,7.0000,0.0000,0.0000},
				{0.0200,20.0420,-11.2000,0.0420,0.7000,7.0000,0.0000,0.0420,0.7000,7.0000,0.0000,0.0420,0.7000,7.0000,0.0000,0.0000},
				{0.0200,20.0588,-11.2000,0.0588,0.8400,7.0000,-0.0000,0.0588,0.8400,7.0000,0.0000,0.0588,0.8400,7.0000,-0.0000,0.0000},
				{0.0200,20.0784,-11.2000,0.0784,0.9800,7.0000,0.0000,0.0784,0.9800,7.0000,0.0000,0.0784,0.9800,7.0000,0.0000,0.0000},
				{0.0200,20.1008,-11.2000,0.1008,1.1200,7.0000,0.0000,0.1008,1.1200,7.0000,0.0000,0.1008,1.1200,7.0000,0.0000,0.0000},
				{0.0200,20.1260,-11.2000,0.1260,1.2600,7.0000,0.0000,0.1260,1.2600,7.0000,0.0000,0.1260,1.2600,7.0000,0.0000,0.0000},
				{0.0200,20.1540,-11.2000,0.1540,1.4000,7.0000,-0.0000,0.1540,1.4000,7.0000,0.0000,0.1540,1.4000,7.0000,-0.0000,0.0000},
				{0.0200,20.1848,-11.2000,0.1848,1.5400,7.0000,0.0000,0.1848,1.5400,7.0000,0.0000,0.1848,1.5400,7.0000,0.0000,0.0000},
				{0.0200,20.2184,-11.2000,0.2184,1.6800,7.0000,-0.0000,0.2184,1.6800,7.0000,0.0000,0.2184,1.6800,7.0000,-0.0000,0.0000},
				{0.0200,20.2548,-11.2000,0.2548,1.8200,7.0000,0.0000,0.2548,1.8200,7.0000,0.0000,0.2548,1.8200,7.0000,0.0000,0.0000},
				{0.0200,20.2940,-11.2000,0.2940,1.9600,7.0000,-0.0000,0.2940,1.9600,7.0000,0.0000,0.2940,1.9600,7.0000,-0.0000,0.0000},
				{0.0200,20.3360,-11.2000,0.3360,2.1000,7.0000,0.0000,0.3360,2.1000,7.0000,0.0000,0.3360,2.1000,7.0000,0.0000,0.0000},
				{0.0200,20.3808,-11.2000,0.3808,2.2400,7.0000,-0.0000,0.3808,2.2400,7.0000,0.0000,0.3808,2.2400,7.0000,-0.0000,0.0000},
				{0.0200,20.4284,-11.2000,0.4284,2.3800,7.0000,0.0000,0.4284,2.3800,7.0000,0.0000,0.4284,2.3800,7.0000,0.0000,0.0000},
				{0.0200,20.4788,-11.2000,0.4788,2.5200,7.0000,0.0000,0.4788,2.5200,7.0000,0.0000,0.4788,2.5200,7.0000,0.0000,0.0000},
				{0.0200,20.5320,-11.2000,0.5320,2.6600,7.0000,-0.0000,0.5320,2.6600,7.0000,0.0000,0.5320,2.6600,7.0000,-0.0000,0.0000},
				{0.0200,20.5880,-11.2000,0.5880,2.8000,7.0000,0.0000,0.5880,2.8000,7.0000,0.0000,0.5880,2.8000,7.0000,0.0000,0.0000},
				{0.0200,20.6468,-11.2000,0.6468,2.9400,7.0000,0.0000,0.6468,2.9400,7.0000,0.0000,0.6468,2.9400,7.0000,0.0000,0.0000},
				{0.0200,20.7084,-11.2000,0.7084,3.0800,7.0000,0.0000,0.7084,3.0800,7.0000,0.0000,0.7084,3.0800,7.0000,0.0000,0.0000},
				{0.0200,20.7728,-11.2000,0.7728,3.2200,7.0000,0.0000,0.7728,3.2200,7.0000,0.0000,0.7728,3.2200,7.0000,0.0000,0.0000},
				{0.0200,20.8400,-11.2000,0.8400,3.3600,7.0000,-0.0000,0.8400,3.3600,7.0000,0.0000,0.8400,3.3600,7.0000,-0.0000,0.0000},
				{0.0200,20.9100,-11.2000,0.9100,3.5000,7.0000,-0.0000,0.9100,3.5000,7.0000,0.0000,0.9100,3.5000,7.0000,-0.0000,0.0000},
				{0.0200,20.9828,-11.2000,0.9828,3.6400,7.0000,0.0000,0.9828,3.6400,7.0000,0.0000,0.9828,3.6400,7.0000,0.0000,0.0000},
				{0.0200,21.0584,-11.2000,1.0584,3.7800,7.0000,-0.0000,1.0584,3.7800,7.0000,0.0000,1.0584,3.7800,7.0000,-0.0000,0.0000},
				{0.0200,21.1368,-11.2000,1.1368,3.9200,7.0000,0.0000,1.1368,3.9200,7.0000,0.0000,1.1368,3.9200,7.0000,0.0000,0.0000},
				{0.0200,21.2180,-11.2000,1.2180,4.0600,7.0000,0.0000,1.2180,4.0600,7.0000,0.0000,1.2180,4.0600,7.0000,0.0000,0.0000},
				{0.0200,21.3020,-11.2000,1.3020,4.2000,7.0000,0.0000,1.3020,4.2000,7.0000,0.0000,1.3020,4.2000,7.0000,0.0000,0.0000},
				{0.0200,21.3888,-11.2000,1.3888,4.3400,7.0000,-0.0000,1.3888,4.3400,7.0000,0.0000,1.3888,4.3400,7.0000,-0.0000,0.0000},
				{0.0200,21.4784,-11.2000,1.4784,4.4800,7.0000,-0.0000,1.4784,4.4800,7.0000,0.0000,1.4784,4.4800,7.0000,-0.0000,0.0000},
				{0.0200,21.5708,-11.2000,1.5708,4.6200,7.0000,0.0000,1.5708,4.6200,7.0000,0.0000,1.5708,4.6200,7.0000,0.0000,0.0000},
				{0.0200,21.6660,-11.2000,1.6660,4.7600,7.0000,0.0000,1.6660,4.7600,7.0000,0.0000,1.6660,4.7600,7.0000,0.0000,0.0000},
				{0.0200,21.7640,-11.2000,1.7640,4.9000,7.0000,-0.0000,1.7640,4.9000,7.0000,0.0000,1.7640,4.9000,7.0000,-0.0000,0.0000},
				{0.0200,21.8648,-11.2000,1.8648,5.0400,7.0000,-0.0000,1.8648,5.0400,7.0000,0.0000,1.8648,5.0400,7.0000,-0.0000,0.0000},
				{0.0200,21.9684,-11.2000,1.9684,5.1800,7.0000,0.0000,1.9684,5.1800,7.0000,0.0000,1.9684,5.1800,7.0000,0.0000,0.0000},
				{0.0200,22.0748,-11.2000,2.0748,5.3200,7.0000,-0.0000,2.0748,5.3200,7.0000,0.0000,2.0748,5.3200,7.0000,-0.0000,0.0000},
				{0.0200,22.1840,-11.2000,2.1840,5.4600,7.0000,0.0000,2.1840,5.4600,7.0000,0.0000,2.1840,5.4600,7.0000,0.0000,0.0000},
				{0.0200,22.2960,-11.2000,2.2960,5.6000,7.0000,0.0000,2.2960,5.6000,7.0000,0.0000,2.2960,5.6000,7.0000,0.0000,0.0000},
				{0.0200,22.4108,-11.2000,2.4108,5.7400,7.0000,0.0000,2.4108,5.7400,7.0000,0.0000,2.4108,5.7400,7.0000,0.0000,0.0000},
				{0.0200,22.5284,-11.2000,2.5284,5.8800,7.0000,0.0000,2.5284,5.8800,7.0000,0.0000,2.5284,5.8800,7.0000,0.0000,0.0000},
				{0.0200,22.6488,-11.2000,2.6488,6.0200,7.0000,0.0000,2.6488,6.0200,7.0000,0.0000,2.6488,6.0200,7.0000,0.0000,0.0000},
				{0.0200,22.7720,-11.2000,2.7720,6.1600,7.0000,0.0000,2.7720,6.1600,7.0000,0.0000,2.7720,6.1600,7.0000,0.0000,0.0000},
				{0.0200,22.8980,-11.2000,2.8980,6.3000,7.0000,0.0000,2.8980,6.3000,7.0000,0.0000,2.8980,6.3000,7.0000,0.0000,0.0000},
				{0.0200,23.0268,-11.2000,3.0268,6.4400,7.0000,0.0000,3.0268,6.4400,7.0000,0.0000,3.0268,6.4400,7.0000,0.0000,0.0000},
				{0.0200,23.1584,-11.2000,3.1584,6.5800,7.0000,-0.0000,3.1584,6.5800,7.0000,0.0000,3.1584,6.5800,7.0000,-0.0000,0.0000},
				{0.0200,23.2928,-11.2000,3.2928,6.7200,7.0000,0.0000,3.2928,6.7200,7.0000,0.0000,3.2928,6.7200,7.0000,0.0000,0.0000},
				{0.0200,23.4300,-11.2000,3.4300,6.8600,7.0000,0.0000,3.4300,6.8600,7.0000,0.0000,3.4300,6.8600,7.0000,0.0000,0.0000},
				{0.0200,23.5700,-11.2000,3.5700,7.0000,7.0000,0.0000,3.5700,7.0000,7.0000,0.0000,3.5700,7.0000,7.0000,0.0000,0.0000},
				{0.0200,23.7100,-11.2000,3.7100,7.0000,0.0000,-350.0000,3.7100,7.0000,7.0000,0.0000,3.7100,7.0000,0.0000,-350.0000,0.0000},
				{0.0200,23.8500,-11.2000,3.8500,7.0000,-0.0000,-0.0000,3.8500,7.0000,7.0000,0.0000,3.8500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,23.9900,-11.2000,3.9900,7.0000,0.0000,0.0000,3.9900,7.0000,7.0000,0.0000,3.9900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,24.1300,-11.2000,4.1300,7.0000,0.0000,0.0000,4.1300,7.0000,7.0000,0.0000,4.1300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,24.2700,-11.2000,4.2700,7.0000,-0.0000,-0.0000,4.2700,7.0000,7.0000,0.0000,4.2700,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,24.4100,-11.2000,4.4100,7.0000,0.0000,0.0000,4.4100,7.0000,7.0000,0.0000,4.4100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,24.5500,-11.2000,4.5500,7.0000,-0.0000,-0.0000,4.5500,7.0000,7.0000,0.0000,4.5500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,24.6900,-11.2000,4.6900,7.0000,0.0000,0.0000,4.6900,7.0000,7.0000,0.0000,4.6900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,24.8300,-11.2000,4.8300,7.0000,0.0000,0.0000,4.8300,7.0000,7.0000,0.0000,4.8300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,24.9700,-11.2000,4.9700,7.0000,0.0000,0.0000,4.9700,7.0000,7.0000,0.0000,4.9700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,25.1100,-11.2000,5.1100,7.0000,-0.0000,-0.0000,5.1100,7.0000,7.0000,0.0000,5.1100,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,25.2500,-11.2000,5.2500,7.0000,0.0000,0.0000,5.2500,7.0000,7.0000,0.0000,5.2500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,25.3900,-11.2000,5.3900,7.0000,-0.0000,-0.0000,5.3900,7.0000,7.0000,0.0000,5.3900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,25.5300,-11.2000,5.5300,7.0000,0.0000,0.0000,5.5300,7.0000,7.0000,0.0000,5.5300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,25.6700,-11.2000,5.6700,7.0000,0.0000,0.0000,5.6700,7.0000,7.0000,0.0000,5.6700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,25.8100,-11.2000,5.8100,7.0000,0.0000,-0.0000,5.8100,7.0000,7.0000,0.0000,5.8100,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,25.9500,-11.2000,5.9500,7.0000,-0.0000,-0.0000,5.9500,7.0000,7.0000,0.0000,5.9500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.0900,-11.2000,6.0900,7.0000,0.0000,0.0000,6.0900,7.0000,7.0000,0.0000,6.0900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,26.2300,-11.2000,6.2300,7.0000,-0.0000,-0.0000,6.2300,7.0000,7.0000,0.0000,6.2300,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.3700,-11.2000,6.3700,7.0000,0.0000,0.0000,6.3700,7.0000,7.0000,0.0000,6.3700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,26.5100,-11.2000,6.5100,7.0000,-0.0000,-0.0000,6.5100,7.0000,7.0000,0.0000,6.5100,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.6500,-11.2000,6.6500,7.0000,0.0000,0.0000,6.6500,7.0000,7.0000,0.0000,6.6500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,26.7900,-11.2000,6.7900,7.0000,-0.0000,-0.0000,6.7900,7.0000,7.0000,0.0000,6.7900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.9300,-11.2000,6.9300,7.0000,0.0000,0.0000,6.9300,7.0000,7.0000,0.0000,6.9300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,27.0700,-11.2000,7.0700,7.0000,0.0000,0.0000,7.0700,7.0000,7.0000,0.0000,7.0700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,27.2100,-11.2000,7.2100,7.0000,0.0000,0.0000,7.2100,7.0000,7.0000,0.0000,7.2100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,27.3500,-11.2000,7.3500,7.0000,0.0000,0.0000,7.3500,7.0000,7.0000,0.0000,7.3500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,27.4900,-11.2000,7.4900,7.0000,0.0000,0.0000,7.4900,7.0000,7.0000,0.0000,7.4900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,27.6300,-11.2000,7.6300,7.0000,0.0000,0.0000,7.6300,7.0000,7.0000,0.0000,7.6300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,27.7700,-11.2000,7.7700,7.0000,-0.0000,-0.0000,7.7700,7.0000,7.0000,0.0000,7.7700,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,27.9100,-11.2000,7.9100,7.0000,0.0000,0.0000,7.9100,7.0000,7.0000,0.0000,7.9100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,28.0500,-11.2000,8.0500,7.0000,-0.0000,-0.0000,8.0500,7.0000,7.0000,0.0000,8.0500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,28.1900,-11.2000,8.1900,7.0000,0.0000,0.0000,8.1900,7.0000,7.0000,0.0000,8.1900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,28.3300,-11.2000,8.3300,7.0000,0.0000,-0.0000,8.3300,7.0000,7.0000,0.0000,8.3300,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,28.4700,-11.2000,8.4700,7.0000,-0.0000,-0.0000,8.4700,7.0000,7.0000,0.0000,8.4700,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,28.6100,-11.2000,8.6100,7.0000,0.0000,0.0000,8.6100,7.0000,7.0000,0.0000,8.6100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,28.7500,-11.2000,8.7500,7.0000,0.0000,0.0000,8.7500,7.0000,7.0000,0.0000,8.7500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,28.8900,-11.2000,8.8900,7.0000,-0.0000,-0.0000,8.8900,7.0000,7.0000,0.0000,8.8900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,29.0300,-11.2000,9.0300,7.0000,0.0000,0.0000,9.0300,7.0000,7.0000,0.0000,9.0300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,29.1700,-11.2000,9.1700,7.0000,0.0000,0.0000,9.1700,7.0000,7.0000,0.0000,9.1700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,29.3100,-11.2000,9.3100,7.0000,-0.0000,-0.0000,9.3100,7.0000,7.0000,0.0000,9.3100,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,29.4500,-11.2000,9.4500,7.0000,0.0000,0.0000,9.4500,7.0000,7.0000,0.0000,9.4500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,29.5900,-11.2000,9.5900,7.0000,0.0000,-0.0000,9.5900,7.0000,7.0000,0.0000,9.5900,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,29.7300,-11.2000,9.7300,7.0000,-0.0000,-0.0000,9.7300,7.0000,7.0000,0.0000,9.7300,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,29.8700,-11.2000,9.8700,7.0000,0.0000,0.0000,9.8700,7.0000,7.0000,0.0000,9.8700,7.0000,0.0000,0.0000,0.0000},
				{0.0200,30.0100,-11.2000,10.0100,7.0000,0.0000,-0.0000,10.0100,7.0000,7.0000,0.0000,10.0100,7.0000,0.0000,-0.0000,0.0000},
				{0.0200,30.1500,-11.2000,10.1500,7.0000,-0.0000,-0.0000,10.1500,7.0000,7.0000,0.0000,10.1500,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,30.2900,-11.2000,10.2900,7.0000,0.0000,0.0000,10.2900,7.0000,7.0000,0.0000,10.2900,7.0000,0.0000,0.0000,0.0000},
				{0.0200,30.4300,-11.2000,10.4300,7.0000,0.0000,0.0000,10.4300,7.0000,7.0000,0.0000,10.4300,7.0000,0.0000,0.0000,0.0000},
				{0.0200,30.5700,-11.2000,10.5700,7.0000,-0.0000,-0.0000,10.5700,7.0000,7.0000,0.0000,10.5700,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,30.7100,-11.2000,10.7100,7.0000,0.0000,0.0000,10.7100,7.0000,7.0000,0.0000,10.7100,7.0000,0.0000,0.0000,0.0000},
				{0.0200,30.8500,-11.2000,10.8500,7.0000,0.0000,0.0000,10.8500,7.0000,7.0000,0.0000,10.8500,7.0000,0.0000,0.0000,0.0000},
				{0.0200,30.9900,-11.2000,10.9900,7.0000,-0.0000,-0.0000,10.9900,7.0000,7.0000,0.0000,10.9900,7.0000,-0.0000,-0.0000,0.0000},
				{0.0200,31.1300,-11.1999,11.1283,6.9135,-4.3228,-216.1380,11.1300,7.0000,7.0000,0.0000,11.1317,7.0865,4.3227,216.1342,0.0015},
				{0.0200,31.2700,-11.1994,11.2627,6.7202,-9.6695,-267.3370,11.2700,7.0000,7.0000,0.0000,11.2773,7.2798,9.6688,267.3080,0.0065},
				{0.0200,31.4100,-11.1980,11.3934,6.5340,-9.3057,18.1878,11.4100,7.0000,7.0000,0.0000,11.4266,7.4659,9.3045,-18.2191,0.0148},
				{0.0200,31.5500,-11.1951,11.5204,6.3523,-9.0882,10.8750,11.5500,7.0000,7.0000,0.0000,11.5796,7.6476,9.0864,-10.9043,0.0263},
				{0.0200,31.6899,-11.1904,11.6438,6.1721,-9.0085,3.9885,11.6900,7.0000,7.0000,0.0000,11.7362,7.8278,9.0060,-4.0177,0.0410},
				{0.0200,31.8297,-11.1835,11.7637,5.9914,-9.0355,-1.3526,11.8300,7.0000,7.0000,0.0000,11.8963,8.0084,9.0325,1.3222,0.0590},
				{0.0200,31.9694,-11.1738,11.8798,5.8086,-9.1390,-5.1757,11.9700,7.0000,7.0000,0.0000,12.0601,8.1911,9.1353,5.1435,0.0801},
				{0.0200,32.1088,-11.1609,11.9923,5.6229,-9.2863,-7.3621,12.1100,7.0000,7.0000,0.0000,12.2277,8.3768,9.2819,7.3276,0.1046},
				{0.0200,32.2478,-11.1444,12.1010,5.4341,-9.4395,-7.6605,12.2500,7.0000,7.0000,0.0000,12.3990,8.5654,9.4344,7.6243,0.1324},
				{0.0200,32.3863,-11.1238,12.2058,5.2430,-9.5537,-5.7125,12.3900,7.0000,7.0000,0.0000,12.5741,8.7564,9.5479,5.6760,0.1637},
				{0.0200,32.5240,-11.0986,12.3069,5.0515,-9.5758,-1.1018,12.5300,7.0000,7.0000,0.0000,12.7531,8.9478,9.5692,1.0672,0.1983},
				{0.0200,32.6607,-11.0685,12.4041,4.8626,-9.4446,6.5578,12.6700,7.0000,7.0000,0.0000,12.9358,9.1365,9.4375,-6.5864,0.2363},
				{0.0200,32.7961,-11.0329,12.4977,4.6807,-9.0950,17.4835,12.8100,7.0000,7.0000,0.0000,13.1222,9.3183,9.0875,-17.5015,0.2775},
				{0.0200,32.9298,-10.9917,12.5880,4.5114,-8.4641,31.5426,12.9500,7.0000,7.0000,0.0000,13.3119,9.4874,8.4566,-31.5442,0.3218},
				{0.0200,33.0616,-10.9443,12.6752,4.3614,-7.5029,48.0603,13.0900,7.0000,7.0000,0.0000,13.5047,9.6373,7.4958,-48.0398,0.3687},
				{0.0200,33.1909,-10.8907,12.7599,4.2376,-6.1891,65.6920,13.2300,7.0000,7.0000,0.0000,13.6999,9.7610,6.1829,-65.6456,0.4178},
				{0.0200,33.3174,-10.8307,12.8429,4.1468,-4.5399,82.4578,13.3700,7.0000,7.0000,0.0000,13.8969,9.8517,4.5352,-82.3847,0.4685},
				{0.0200,33.4406,-10.7643,12.9248,4.0944,-2.6196,96.0165,13.5100,7.0000,7.0000,0.0000,14.0950,9.9040,2.6168,-95.9205,0.5201},
				{0.0200,33.5602,-10.6916,13.0064,4.0837,-0.5361,104.1710,13.6500,7.0000,7.0000,0.0000,14.2933,9.9147,0.5356,-104.0607,0.5720},
				{0.0200,33.6759,-10.6128,13.0887,4.1151,1.5731,105.4600,13.7900,7.0000,7.0000,0.0000,14.4910,9.8833,-1.5714,-105.3470,0.6233},
				{0.0200,33.7875,-10.5283,13.1725,4.1864,3.5651,99.6011,13.9300,7.0000,7.0000,0.0000,14.6872,9.8121,-3.5613,-99.4978,0.6733},
				{0.0200,33.8948,-10.4384,13.2583,4.2928,5.3167,87.5788,14.0700,7.0000,7.0000,0.0000,14.8813,9.7059,-5.3112,-87.4955,0.7214},
				{0.0200,33.9978,-10.3435,13.3469,4.4276,6.7433,71.3347,14.2100,7.0000,7.0000,0.0000,15.0727,9.5711,-6.7368,-71.2771,0.7671},
				{0.0200,34.0964,-10.2442,13.4386,4.5838,7.8075,53.2068,14.3500,7.0000,7.0000,0.0000,15.2610,9.4151,-7.8003,-53.1759,0.8101},
				{0.0200,34.1909,-10.1408,13.5336,4.7541,8.5147,35.3608,14.4900,7.0000,7.0000,0.0000,15.4459,9.2450,-8.5074,-35.3540,0.8500},
				{0.0200,34.2813,-10.0340,13.6323,4.9321,8.9029,19.4078,14.6300,7.0000,7.0000,0.0000,15.6273,9.0671,-8.8958,-19.4198,0.8867},
				{0.0200,34.3679,-9.9240,13.7345,5.1127,9.0283,6.2710,14.7700,7.0000,7.0000,0.0000,15.8050,8.8866,-9.0217,-6.2958,0.9203},
				{0.0200,34.4509,-9.8113,13.8404,5.2918,8.9534,-3.7445,14.9100,7.0000,7.0000,0.0000,15.9792,8.7077,-8.9474,3.7120,0.9506},
				{0.0200,34.5307,-9.6962,13.9497,5.4665,8.7378,-10.7781,15.0500,7.0000,7.0000,0.0000,16.1498,8.5330,-8.7326,10.7424,0.9779},
				{0.0200,34.6075,-9.5792,14.0624,5.6352,8.4333,-15.2243,15.1900,7.0000,7.0000,0.0000,16.3171,8.3645,-8.4288,15.1884,1.0022},
				{0.0200,34.6816,-9.4604,14.1783,5.7968,8.0818,-17.5777,15.3300,7.0000,7.0000,0.0000,16.4812,8.2029,-8.0780,17.5437,1.0236},
				{0.0200,34.7533,-9.3401,14.2974,5.9511,7.7152,-18.3300,15.4700,7.0000,7.0000,0.0000,16.6422,8.0487,-7.7120,18.2988,1.0422},
				{0.0200,34.8229,-9.2187,14.4193,6.0983,7.3569,-17.9138,15.6100,7.0000,7.0000,0.0000,16.8002,7.9016,-7.3543,17.8859,1.0582},
				{0.0200,34.8907,-9.0962,14.5441,6.2387,7.0233,-16.6805,15.7500,7.0000,7.0000,0.0000,16.9554,7.7611,-7.0211,16.6559,1.0718},
				{0.0200,34.9570,-8.9729,14.6716,6.3733,6.7253,-14.8993,15.8900,7.0000,7.0000,0.0000,17.1079,7.6267,-6.7236,14.8777,1.0829},
				{0.0200,35.0220,-8.8489,14.8016,6.5027,6.4700,-12.7666,16.0300,7.0000,7.0000,0.0000,17.2579,7.4973,-6.4686,12.7476,1.0917},
				{0.0200,35.0861,-8.7245,14.9342,6.6279,6.2616,-10.4191,16.1700,7.0000,7.0000,0.0000,17.4053,7.3721,-6.2606,10.4022,1.0984},
				{0.0200,35.1495,-8.5996,15.0692,6.7499,6.1026,-7.9477,16.3100,7.0000,7.0000,0.0000,17.5503,7.2501,-6.1019,7.9324,1.1028},
				{0.0200,35.2125,-8.4746,15.2066,6.8698,5.9945,-5.4096,16.4500,7.0000,7.0000,0.0000,17.6929,7.1302,-5.9940,5.3957,1.1051},
				{0.0200,35.2754,-8.3495,15.3464,6.9886,5.9377,-2.8391,16.5900,7.0000,7.0000,0.0000,17.8332,7.0114,-5.9375,2.8259,1.1053},
				{0.0200,35.3383,-8.2244,15.4885,7.1072,5.9326,-0.2556,16.7300,7.0000,7.0000,0.0000,17.9710,6.8928,-5.9327,0.2426,1.1034},
				{0.0200,35.4016,-8.0996,15.6330,7.2268,5.9791,2.3287,16.8700,7.0000,7.0000,0.0000,18.1065,6.7732,-5.9795,-2.3419,1.0994},
				{0.0200,35.4655,-7.9750,15.7800,7.3484,6.0772,4.9023,17.0100,7.0000,7.0000,0.0000,18.2395,6.6516,-6.0778,-4.9161,1.0932},
				{0.0200,35.5304,-7.8510,15.9295,7.4729,6.2261,7.4475,17.1500,7.0000,7.0000,0.0000,18.3701,6.5271,-6.2271,-7.4624,1.0848},
				{0.0200,35.5964,-7.7275,16.0815,7.6014,6.4248,9.9338,17.2900,7.0000,7.0000,0.0000,18.4980,6.3986,-6.4261,-9.9503,1.0741},
				{0.0200,35.6639,-7.6049,16.2362,7.7348,6.6710,12.3090,17.4300,7.0000,7.0000,0.0000,18.6233,6.2651,-6.6726,-12.3276,1.0610},
				{0.0200,35.7332,-7.4832,16.3937,7.8740,6.9608,14.4896,17.5700,7.0000,7.0000,0.0000,18.7458,6.1258,-6.9628,-14.5107,1.0455},
				{0.0200,35.8044,-7.3627,16.5541,8.0198,7.2878,16.3489,17.7100,7.0000,7.0000,0.0000,18.8654,5.9800,-7.2903,-16.3728,1.0274},
				{0.0200,35.8780,-7.2436,16.7175,8.1726,7.6418,17.7030,17.8500,7.0000,7.0000,0.0000,18.9820,5.8271,-7.6449,-17.7302,1.0065},
				{0.0200,35.9543,-7.1262,16.8842,8.3328,8.0078,18.2981,17.9900,7.0000,7.0000,0.0000,19.0953,5.6669,-8.0115,-18.3286,0.9828},
				{0.0200,36.0335,-7.0107,17.0542,8.5000,8.3638,17.7993,18.1300,7.0000,7.0000,0.0000,19.2053,5.4996,-8.3681,-17.8328,0.9561},
				{0.0200,36.1158,-6.8975,17.2276,8.6736,8.6795,15.7893,18.2700,7.0000,7.0000,0.0000,19.3118,5.3259,-8.6846,-15.8248,0.9264},
				{0.0200,36.2017,-6.7870,17.4047,8.8519,8.9153,11.7856,18.4100,7.0000,7.0000,0.0000,19.4148,5.1474,-8.9211,-11.8214,0.8934},
				{0.0200,36.2914,-6.6795,17.5853,9.0323,9.0210,5.2887,18.5500,7.0000,7.0000,0.0000,19.5141,4.9669,-9.0275,-5.3221,0.8573},
				{0.0200,36.3851,-6.5754,17.7695,9.2111,8.9385,-4.1243,18.6900,7.0000,7.0000,0.0000,19.6099,4.7880,-8.9455,4.0975,0.8180},
				{0.0200,36.4809,-6.4773,17.9534,9.1940,-0.8572,-489.7855,18.8272,6.8600,-7.0000,0.0000,19.7004,4.5250,-13.1470,-210.0719,0.7765},
				{0.0200,36.5788,-6.3852,18.1365,9.1551,-1.9426,-54.2732,18.9616,6.7200,-7.0000,0.0000,19.7861,4.2838,-12.0606,54.3171,0.7332},
				{0.0200,36.6785,-6.2993,18.3183,9.0904,-3.2382,-64.7779,19.0932,6.5800,-7.0000,0.0000,19.8674,4.0685,-10.7640,64.8346,0.6885},
				{0.0200,36.7797,-6.2197,18.4983,8.9964,-4.6988,-73.0288,19.2220,6.4400,-7.0000,0.0000,19.9451,3.8825,-9.3021,73.0947,0.6431},
				{0.0200,36.8823,-6.1465,18.6757,8.8713,-6.2558,-77.8524,19.3480,6.3000,-7.0000,0.0000,20.0196,3.7276,-7.7436,77.9219,0.5974},
				{0.0200,36.9857,-6.0795,18.8500,8.7148,-7.8254,-78.4783,19.4712,6.1600,-7.0000,0.0000,20.0917,3.6042,-6.1727,78.5452,0.5519},
				{0.0200,37.0896,-6.0187,19.0206,8.5284,-9.3201,-74.7344,19.5916,6.0200,-7.0000,0.0000,20.1619,3.5106,-4.6769,74.7925,0.5073},
				{0.0200,37.1936,-5.9638,19.1869,8.3151,-10.6619,-67.0910,19.7092,5.8800,-7.0000,0.0000,20.2308,3.4440,-3.3341,67.1360,0.4640},
				{0.0200,37.2973,-5.9146,19.3484,8.0793,-11.7926,-56.5373,19.8240,5.7400,-7.0000,0.0000,20.2988,3.3999,-2.2028,56.5668,0.4224},
				{0.0200,37.4003,-5.8707,19.5050,7.8257,-12.6794,-44.3381,19.9360,5.6000,-7.0000,0.0000,20.3663,3.3736,-1.3158,44.3522,0.3828},
				{0.0200,37.5023,-5.8318,19.6561,7.5594,-13.3146,-31.7622,20.0452,5.4600,-7.0000,0.0000,20.4335,3.3600,-0.6805,31.7625,0.3455},
				{0.0200,37.6031,-5.7976,19.8018,7.2852,-13.7120,-19.8661,20.1516,5.3200,-7.0000,0.0000,20.5006,3.3543,-0.2834,19.8558,0.3106},
				{0.0200,37.7022,-5.7675,19.9420,7.0072,-13.8996,-9.3796,20.2552,5.1800,-7.0000,0.0000,20.5676,3.3524,-0.0962,9.3618,0.2781},
				{0.0200,37.7995,-5.7413,20.0766,6.7289,-13.9133,-0.6886,20.3560,5.0400,-7.0000,0.0000,20.6346,3.3507,-0.0828,0.6666,0.2480},
				{0.0200,37.8949,-5.7186,20.2056,6.4531,-13.7911,6.1098,20.4540,4.9000,-7.0000,0.0000,20.7016,3.3466,-0.2055,-6.1336,0.2204},
				{0.0200,37.9880,-5.6990,20.3293,6.1817,-13.5686,11.1240,20.5492,4.7600,-7.0000,0.0000,20.7683,3.3380,-0.4285,-11.1477,0.1952},
				{0.0200,38.0789,-5.6821,20.4476,5.9162,-13.2770,14.5814,20.6416,4.6200,-7.0000,0.0000,20.8348,3.3236,-0.7205,-14.6038,0.1721},
				{0.0200,38.1673,-5.6677,20.5607,5.6573,-12.9418,16.7594,20.7312,4.4800,-7.0000,0.0000,20.9008,3.3025,-1.0561,-16.7796,0.1512},
				{0.0200,38.2532,-5.6555,20.6688,5.4057,-12.5831,17.9370,20.8180,4.3400,-7.0000,0.0000,20.9663,3.2742,-1.4152,-17.9549,0.1322},
				{0.0200,38.3366,-5.6451,20.7721,5.1613,-12.2157,18.3674,20.9020,4.2000,-7.0000,0.0000,21.0311,3.2386,-1.7829,-18.3829,0.1151},
				{0.0200,38.4173,-5.6364,20.8706,4.9243,-11.8504,18.2647,20.9832,4.0600,-7.0000,0.0000,21.0950,3.1956,-2.1484,-18.2777,0.0998},
				{0.0200,38.4954,-5.6291,20.9644,4.6944,-11.4944,17.8003,21.0616,3.9200,-7.0000,0.0000,21.1579,3.1455,-2.5047,-17.8114,0.0860},
				{0.0200,38.5707,-5.6231,21.0539,4.4714,-11.1523,17.1073,21.1372,3.7800,-7.0000,0.0000,21.2197,3.0886,-2.8470,-17.1163,0.0737},
				{0.0200,38.6434,-5.6182,21.1390,4.2549,-10.8266,16.2840,21.2100,3.6400,-7.0000,0.0000,21.2802,3.0251,-3.1728,-16.2915,0.0628},
				{0.0200,38.7132,-5.6141,21.2199,4.0445,-10.5186,15.4014,21.2800,3.5000,-7.0000,0.0000,21.3393,2.9555,-3.4810,-15.4075,0.0531},
				{0.0200,38.7804,-5.6108,21.2967,3.8399,-10.2284,14.5085,21.3472,3.3600,-7.0000,0.0000,21.3969,2.8801,-3.7712,-14.5134,0.0446},
				{0.0200,38.8447,-5.6082,21.3695,3.6408,-9.9557,13.6375,21.4116,3.2200,-7.0000,0.0000,21.4529,2.7992,-4.0441,-13.6414,0.0371},
				{0.0200,38.9063,-5.6061,21.4384,3.4468,-9.6995,12.8082,21.4732,3.0800,-7.0000,0.0000,21.5071,2.7132,-4.3003,-12.8114,0.0306},
				{0.0200,38.9651,-5.6045,21.5036,3.2576,-9.4589,12.0313,21.5320,2.9400,-7.0000,0.0000,21.5596,2.6223,-4.5410,-12.0338,0.0249},
				{0.0200,39.0210,-5.6032,21.5650,3.0730,-9.2327,11.3107,21.5880,2.8000,-7.0000,0.0000,21.6101,2.5270,-4.7672,-11.3127,0.0201},
				{0.0200,39.0742,-5.6023,21.6229,2.8926,-9.0197,10.6459,21.6412,2.6600,-7.0000,0.0000,21.6587,2.4274,-4.9802,-10.6474,0.0159},
				{0.0200,39.1246,-5.6016,21.6772,2.7162,-8.8191,10.0331,21.6916,2.5200,-7.0000,0.0000,21.7052,2.3238,-5.1809,-10.0342,0.0124},
				{0.0200,39.1722,-5.6011,21.7281,2.5436,-8.6298,9.4663,21.7392,2.3800,-7.0000,0.0000,21.7495,2.2164,-5.3702,-9.4672,0.0095},
				{0.0200,39.2170,-5.6007,21.7756,2.3746,-8.4510,8.9386,21.7840,2.2400,-7.0000,0.0000,21.7916,2.1054,-5.5490,-8.9392,0.0071},
				{0.0200,39.2590,-5.6004,21.8197,2.2090,-8.2822,8.4418,21.8260,2.1000,-7.0000,0.0000,21.8314,1.9910,-5.7178,-8.4423,0.0052},
				{0.0200,39.2982,-5.6002,21.8607,2.0465,-8.1228,7.9680,21.8652,1.9600,-7.0000,0.0000,21.8689,1.8735,-5.8772,-7.9683,0.0037},
				{0.0200,39.3346,-5.6001,21.8984,1.8871,-7.9726,7.5091,21.9016,1.8200,-7.0000,0.0000,21.9039,1.7529,-6.0274,-7.5093,0.0025},
				{0.0200,39.3682,-5.6001,21.9330,1.7304,-7.8315,7.0574,21.9352,1.6800,-7.0000,0.0000,21.9365,1.6296,-6.1685,-7.0575,0.0016},
				{0.0200,39.3990,-5.6000,21.9646,1.5764,-7.6993,6.6059,21.9660,1.5400,-7.0000,0.0000,21.9666,1.5036,-6.3007,-6.6060,0.0009},
				{0.0200,39.4270,-5.6000,21.9931,1.4249,-7.5764,6.1484,21.9940,1.4000,-7.0000,0.0000,21.9941,1.3751,-6.4236,-6.1485,0.0005},
				{0.0200,39.4522,-5.6000,22.0186,1.2757,-7.4628,5.6796,22.0192,1.2600,-7.0000,0.0000,22.0190,1.2443,-6.5372,-5.6796,0.0002},
				{0.0200,39.4746,-5.6000,22.0411,1.1285,-7.3589,5.1951,22.0416,1.1200,-7.0000,0.0000,22.0412,1.1115,-6.6411,-5.1951,0.0001},
				{0.0200,39.4942,-5.6000,22.0608,0.9832,-7.2650,4.6920,22.0612,0.9800,-7.0000,0.0000,22.0608,0.9768,-6.7350,-4.6920,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.2891,-34.7050,-1371.9955,22.0670,0.8400,-7.0000,0.0000,22.0665,0.2887,-34.4051,-1383.5070,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.0000,-14.4537,1012.5640,22.0670,0.7000,-7.0000,0.0000,22.0665,0.0000,-14.4363,998.4410,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.0000,0.0000,722.6838,22.0670,0.5600,-7.0000,0.0000,22.0665,0.0000,0.0000,721.8137,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.0000,0.0000,0.0000,22.0670,0.4200,-7.0000,0.0000,22.0665,0.0000,0.0000,0.0000,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.0000,0.0000,0.0000,22.0670,0.2800,-7.0000,0.0000,22.0665,0.0000,0.0000,0.0000,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.0000,0.0000,0.0000,22.0670,0.1400,-7.0000,0.0000,22.0665,0.0000,0.0000,0.0000,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.0000,0.0000,0.0000,22.0670,0.0000,-7.0000,0.0000,22.0665,0.0000,0.0000,0.0000,0.0000},
				{0.0200,39.5000,-5.6000,22.0666,0.0000,0.0000,0.0000,22.0670,-0.1400,-7.0000,0.0000,22.0665,0.0000,0.0000,0.0000,0.0000},

	    };

	@Override
	public double[][] getPath() {
	    return points;
	}
}