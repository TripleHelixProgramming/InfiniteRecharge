package frc.paths;

import com.team319.trajectory.Path;

public class TrenchLayupPartOne extends Path {
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
				{0.0200,21.8640,-11.2000,1.8640,5.0000,5.0000,-100.0000,1.8640,5.0000,7.0000,0.0000,1.8640,5.0000,5.0000,-100.0000,0.0000},
				{0.0200,21.9640,-11.2000,1.9640,5.0000,0.0000,-250.0000,1.9640,5.0000,7.0000,0.0000,1.9640,5.0000,0.0000,-250.0000,0.0000},
				{0.0200,22.0640,-11.2000,2.0640,5.0000,-0.0000,-0.0000,2.0640,5.0000,7.0000,0.0000,2.0640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,22.1640,-11.2000,2.1640,5.0000,0.0000,0.0000,2.1640,5.0000,7.0000,0.0000,2.1640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,22.2640,-11.2000,2.2640,5.0000,-0.0000,-0.0000,2.2640,5.0000,7.0000,0.0000,2.2640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,22.3640,-11.2000,2.3640,5.0000,0.0000,0.0000,2.3640,5.0000,7.0000,0.0000,2.3640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,22.4640,-11.2000,2.4640,5.0000,-0.0000,-0.0000,2.4640,5.0000,7.0000,0.0000,2.4640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,22.5640,-11.2000,2.5640,5.0000,0.0000,0.0000,2.5640,5.0000,7.0000,0.0000,2.5640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,22.6640,-11.2000,2.6640,5.0000,-0.0000,-0.0000,2.6640,5.0000,7.0000,0.0000,2.6640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,22.7640,-11.2000,2.7640,5.0000,0.0000,0.0000,2.7640,5.0000,7.0000,0.0000,2.7640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,22.8640,-11.2000,2.8640,5.0000,-0.0000,-0.0000,2.8640,5.0000,7.0000,0.0000,2.8640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,22.9640,-11.2000,2.9640,5.0000,0.0000,0.0000,2.9640,5.0000,7.0000,0.0000,2.9640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,23.0640,-11.2000,3.0640,5.0000,0.0000,0.0000,3.0640,5.0000,7.0000,0.0000,3.0640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,23.1640,-11.2000,3.1640,5.0000,0.0000,-0.0000,3.1640,5.0000,7.0000,0.0000,3.1640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,23.2640,-11.2000,3.2640,5.0000,-0.0000,-0.0000,3.2640,5.0000,7.0000,0.0000,3.2640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,23.3640,-11.2000,3.3640,5.0000,0.0000,0.0000,3.3640,5.0000,7.0000,0.0000,3.3640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,23.4640,-11.2000,3.4640,5.0000,0.0000,0.0000,3.4640,5.0000,7.0000,0.0000,3.4640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,23.5640,-11.2000,3.5640,5.0000,-0.0000,-0.0000,3.5640,5.0000,7.0000,0.0000,3.5640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,23.6640,-11.2000,3.6640,5.0000,0.0000,0.0000,3.6640,5.0000,7.0000,0.0000,3.6640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,23.7640,-11.2000,3.7640,5.0000,-0.0000,-0.0000,3.7640,5.0000,7.0000,0.0000,3.7640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,23.8640,-11.2000,3.8640,5.0000,0.0000,0.0000,3.8640,5.0000,7.0000,0.0000,3.8640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,23.9640,-11.2000,3.9640,5.0000,-0.0000,-0.0000,3.9640,5.0000,7.0000,0.0000,3.9640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,24.0640,-11.2000,4.0640,5.0000,0.0000,0.0000,4.0640,5.0000,7.0000,0.0000,4.0640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,24.1640,-11.2000,4.1640,5.0000,0.0000,0.0000,4.1640,5.0000,7.0000,0.0000,4.1640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,24.2640,-11.2000,4.2640,5.0000,-0.0000,-0.0000,4.2640,5.0000,7.0000,0.0000,4.2640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,24.3640,-11.2000,4.3640,5.0000,0.0000,0.0000,4.3640,5.0000,7.0000,0.0000,4.3640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,24.4640,-11.2000,4.4640,5.0000,-0.0000,-0.0000,4.4640,5.0000,7.0000,0.0000,4.4640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,24.5640,-11.2000,4.5640,5.0000,0.0000,0.0000,4.5640,5.0000,7.0000,0.0000,4.5640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,24.6640,-11.2000,4.6640,5.0000,-0.0000,-0.0000,4.6640,5.0000,7.0000,0.0000,4.6640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,24.7640,-11.2000,4.7640,5.0000,0.0000,0.0000,4.7640,5.0000,7.0000,0.0000,4.7640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,24.8640,-11.2000,4.8640,5.0000,0.0000,0.0000,4.8640,5.0000,7.0000,0.0000,4.8640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,24.9640,-11.2000,4.9640,5.0000,-0.0000,-0.0000,4.9640,5.0000,7.0000,0.0000,4.9640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,25.0640,-11.2000,5.0640,5.0000,0.0000,0.0000,5.0640,5.0000,7.0000,0.0000,5.0640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,25.1640,-11.2000,5.1640,5.0000,0.0000,0.0000,5.1640,5.0000,7.0000,0.0000,5.1640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,25.2640,-11.2000,5.2640,5.0000,-0.0000,-0.0000,5.2640,5.0000,7.0000,0.0000,5.2640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,25.3640,-11.2000,5.3640,5.0000,0.0000,0.0000,5.3640,5.0000,7.0000,0.0000,5.3640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,25.4640,-11.2000,5.4640,5.0000,0.0000,0.0000,5.4640,5.0000,7.0000,0.0000,5.4640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,25.5640,-11.2000,5.5640,5.0000,0.0000,0.0000,5.5640,5.0000,7.0000,0.0000,5.5640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,25.6640,-11.2000,5.6640,5.0000,0.0000,-0.0000,5.6640,5.0000,7.0000,0.0000,5.6640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,25.7640,-11.2000,5.7640,5.0000,0.0000,-0.0000,5.7640,5.0000,7.0000,0.0000,5.7640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,25.8640,-11.2000,5.8640,5.0000,0.0000,-0.0000,5.8640,5.0000,7.0000,0.0000,5.8640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,25.9640,-11.2000,5.9640,5.0000,-0.0000,-0.0000,5.9640,5.0000,7.0000,0.0000,5.9640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.0640,-11.2000,6.0640,5.0000,0.0000,0.0000,6.0640,5.0000,7.0000,0.0000,6.0640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,26.1640,-11.2000,6.1640,5.0000,0.0000,-0.0000,6.1640,5.0000,7.0000,0.0000,6.1640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,26.2640,-11.2000,6.2640,5.0000,-0.0000,-0.0000,6.2640,5.0000,7.0000,0.0000,6.2640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.3640,-11.2000,6.3640,5.0000,0.0000,0.0000,6.3640,5.0000,7.0000,0.0000,6.3640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,26.4640,-11.2000,6.4640,5.0000,-0.0000,-0.0000,6.4640,5.0000,7.0000,0.0000,6.4640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.5640,-11.2000,6.5640,5.0000,0.0000,0.0000,6.5640,5.0000,7.0000,0.0000,6.5640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,26.6640,-11.2000,6.6640,5.0000,0.0000,-0.0000,6.6640,5.0000,7.0000,0.0000,6.6640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,26.7640,-11.2000,6.7640,5.0000,-0.0000,-0.0000,6.7640,5.0000,7.0000,0.0000,6.7640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,26.8640,-11.2000,6.8640,5.0000,0.0000,0.0000,6.8640,5.0000,7.0000,0.0000,6.8640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,26.9640,-11.2000,6.9640,5.0000,-0.0000,-0.0000,6.9640,5.0000,7.0000,0.0000,6.9640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,27.0640,-11.2000,7.0640,5.0000,0.0000,0.0000,7.0640,5.0000,7.0000,0.0000,7.0640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,27.1640,-11.2000,7.1640,5.0000,-0.0000,-0.0000,7.1640,5.0000,7.0000,0.0000,7.1640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,27.2640,-11.2000,7.2640,5.0000,0.0000,0.0000,7.2640,5.0000,7.0000,0.0000,7.2640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,27.3640,-11.2000,7.3640,5.0000,0.0000,-0.0000,7.3640,5.0000,7.0000,0.0000,7.3640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,27.4640,-11.2000,7.4640,5.0000,-0.0000,-0.0000,7.4640,5.0000,7.0000,0.0000,7.4640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,27.5640,-11.2000,7.5640,5.0000,0.0000,0.0000,7.5640,5.0000,7.0000,0.0000,7.5640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,27.6640,-11.2000,7.6640,5.0000,-0.0000,-0.0000,7.6640,5.0000,7.0000,0.0000,7.6640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,27.7640,-11.2000,7.7640,5.0000,0.0000,0.0000,7.7640,5.0000,7.0000,0.0000,7.7640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,27.8640,-11.2000,7.8640,5.0000,0.0000,-0.0000,7.8640,5.0000,7.0000,0.0000,7.8640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,27.9640,-11.2000,7.9640,5.0000,0.0000,0.0000,7.9640,5.0000,7.0000,0.0000,7.9640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,28.0640,-11.2000,8.0640,5.0000,-0.0000,-0.0000,8.0640,5.0000,7.0000,0.0000,8.0640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,28.1640,-11.2000,8.1640,5.0000,0.0000,0.0000,8.1640,5.0000,7.0000,0.0000,8.1640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,28.2640,-11.2000,8.2640,5.0000,-0.0000,-0.0000,8.2640,5.0000,7.0000,0.0000,8.2640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,28.3640,-11.2000,8.3640,5.0000,0.0000,0.0000,8.3640,5.0000,7.0000,0.0000,8.3640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,28.4640,-11.2000,8.4640,5.0000,0.0000,-0.0000,8.4640,5.0000,7.0000,0.0000,8.4640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,28.5640,-11.2000,8.5640,5.0000,-0.0000,-0.0000,8.5640,5.0000,7.0000,0.0000,8.5640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,28.6640,-11.2000,8.6640,5.0000,0.0000,0.0000,8.6640,5.0000,7.0000,0.0000,8.6640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,28.7640,-11.2000,8.7640,5.0000,-0.0000,-0.0000,8.7640,5.0000,7.0000,0.0000,8.7640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,28.8640,-11.2000,8.8640,5.0000,0.0000,0.0000,8.8640,5.0000,7.0000,0.0000,8.8640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,28.9640,-11.2000,8.9640,5.0000,0.0000,-0.0000,8.9640,5.0000,7.0000,0.0000,8.9640,5.0000,0.0000,-0.0000,0.0000},
				{0.0200,29.0640,-11.2000,9.0640,5.0000,0.0000,0.0000,9.0640,5.0000,7.0000,0.0000,9.0640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,29.1640,-11.2000,9.1640,5.0000,-0.0000,-0.0000,9.1640,5.0000,7.0000,0.0000,9.1640,5.0000,-0.0000,-0.0000,0.0000},
				{0.0200,29.2640,-11.2000,9.2640,5.0000,0.0000,0.0000,9.2640,5.0000,7.0000,0.0000,9.2640,5.0000,0.0000,0.0000,0.0000},
				{0.0200,29.3612,-11.2000,9.3612,4.8600,-7.0000,-350.0000,9.3612,4.8600,-7.0000,0.0000,9.3612,4.8600,-7.0000,-350.0000,0.0000},
				{0.0200,29.4556,-11.2000,9.4556,4.7200,-7.0000,-0.0000,9.4556,4.7200,-7.0000,0.0000,9.4556,4.7200,-7.0000,-0.0000,0.0000},
				{0.0200,29.5472,-11.2000,9.5472,4.5800,-7.0000,0.0000,9.5472,4.5800,-7.0000,0.0000,9.5472,4.5800,-7.0000,0.0000,0.0000},
				{0.0200,29.6360,-11.2000,9.6360,4.4400,-7.0000,0.0000,9.6360,4.4400,-7.0000,0.0000,9.6360,4.4400,-7.0000,0.0000,0.0000},
				{0.0200,29.7220,-11.2000,9.7220,4.3000,-7.0000,-0.0000,9.7220,4.3000,-7.0000,0.0000,9.7220,4.3000,-7.0000,-0.0000,0.0000},
				{0.0200,29.8052,-11.2000,9.8052,4.1600,-7.0000,0.0000,9.8052,4.1600,-7.0000,0.0000,9.8052,4.1600,-7.0000,0.0000,0.0000},
				{0.0200,29.8856,-11.2000,9.8856,4.0200,-7.0000,0.0000,9.8856,4.0200,-7.0000,0.0000,9.8856,4.0200,-7.0000,0.0000,0.0000},
				{0.0200,29.9632,-11.2000,9.9632,3.8800,-7.0000,-0.0000,9.9632,3.8800,-7.0000,0.0000,9.9632,3.8800,-7.0000,-0.0000,0.0000},
				{0.0200,30.0380,-11.2000,10.0380,3.7400,-7.0000,0.0000,10.0380,3.7400,-7.0000,0.0000,10.0380,3.7400,-7.0000,0.0000,0.0000},
				{0.0200,30.1100,-11.2000,10.1100,3.6000,-7.0000,0.0000,10.1100,3.6000,-7.0000,0.0000,10.1100,3.6000,-7.0000,0.0000,0.0000},
				{0.0200,30.1792,-11.2000,10.1792,3.4600,-7.0000,-0.0000,10.1792,3.4600,-7.0000,0.0000,10.1792,3.4600,-7.0000,-0.0000,0.0000},
				{0.0200,30.2456,-11.2000,10.2456,3.3200,-7.0000,0.0000,10.2456,3.3200,-7.0000,0.0000,10.2456,3.3200,-7.0000,0.0000,0.0000},
				{0.0200,30.3092,-11.2000,10.3092,3.1800,-7.0000,0.0000,10.3092,3.1800,-7.0000,0.0000,10.3092,3.1800,-7.0000,0.0000,0.0000},
				{0.0200,30.3700,-11.2000,10.3700,3.0400,-7.0000,-0.0000,10.3700,3.0400,-7.0000,0.0000,10.3700,3.0400,-7.0000,-0.0000,0.0000},
				{0.0200,30.4280,-11.2000,10.4280,2.9000,-7.0000,0.0000,10.4280,2.9000,-7.0000,0.0000,10.4280,2.9000,-7.0000,0.0000,0.0000},
				{0.0200,30.4832,-11.2000,10.4832,2.7600,-7.0000,-0.0000,10.4832,2.7600,-7.0000,0.0000,10.4832,2.7600,-7.0000,-0.0000,0.0000},
				{0.0200,30.5356,-11.2000,10.5356,2.6200,-7.0000,0.0000,10.5356,2.6200,-7.0000,0.0000,10.5356,2.6200,-7.0000,0.0000,0.0000},
				{0.0200,30.5852,-11.2000,10.5852,2.4800,-7.0000,-0.0000,10.5852,2.4800,-7.0000,0.0000,10.5852,2.4800,-7.0000,-0.0000,0.0000},
				{0.0200,30.6320,-11.2000,10.6320,2.3400,-7.0000,0.0000,10.6320,2.3400,-7.0000,0.0000,10.6320,2.3400,-7.0000,0.0000,0.0000},
				{0.0200,30.6760,-11.2000,10.6760,2.2000,-7.0000,0.0000,10.6760,2.2000,-7.0000,0.0000,10.6760,2.2000,-7.0000,0.0000,0.0000},
				{0.0200,30.7172,-11.2000,10.7172,2.0600,-7.0000,-0.0000,10.7172,2.0600,-7.0000,0.0000,10.7172,2.0600,-7.0000,-0.0000,0.0000},
				{0.0200,30.7556,-11.2000,10.7556,1.9200,-7.0000,0.0000,10.7556,1.9200,-7.0000,0.0000,10.7556,1.9200,-7.0000,0.0000,0.0000},
				{0.0200,30.7912,-11.2000,10.7912,1.7800,-7.0000,0.0000,10.7912,1.7800,-7.0000,0.0000,10.7912,1.7800,-7.0000,0.0000,0.0000},
				{0.0200,30.8240,-11.2000,10.8240,1.6400,-7.0000,-0.0000,10.8240,1.6400,-7.0000,0.0000,10.8240,1.6400,-7.0000,-0.0000,0.0000},
				{0.0200,30.8540,-11.2000,10.8540,1.5000,-7.0000,0.0000,10.8540,1.5000,-7.0000,0.0000,10.8540,1.5000,-7.0000,0.0000,0.0000},
				{0.0200,30.8812,-11.2000,10.8812,1.3600,-7.0000,0.0000,10.8812,1.3600,-7.0000,0.0000,10.8812,1.3600,-7.0000,0.0000,0.0000},
				{0.0200,30.9056,-11.2000,10.9056,1.2200,-7.0000,-0.0000,10.9056,1.2200,-7.0000,0.0000,10.9056,1.2200,-7.0000,-0.0000,0.0000},
				{0.0200,30.9272,-11.2000,10.9272,1.0800,-7.0000,0.0000,10.9272,1.0800,-7.0000,0.0000,10.9272,1.0800,-7.0000,0.0000,0.0000},
				{0.0200,30.9460,-11.2000,10.9460,0.9400,-7.0000,-0.0000,10.9460,0.9400,-7.0000,0.0000,10.9460,0.9400,-7.0000,-0.0000,0.0000},
				{0.0200,30.9620,-11.2000,10.9620,0.8000,-7.0000,0.0000,10.9620,0.8000,-7.0000,0.0000,10.9620,0.8000,-7.0000,0.0000,0.0000},
				{0.0200,30.9752,-11.2000,10.9752,0.6600,-7.0000,-0.0000,10.9752,0.6600,-7.0000,0.0000,10.9752,0.6600,-7.0000,-0.0000,0.0000},
				{0.0200,30.9856,-11.2000,10.9856,0.5200,-7.0000,0.0000,10.9856,0.5200,-7.0000,0.0000,10.9856,0.5200,-7.0000,0.0000,0.0000},
				{0.0200,30.9932,-11.2000,10.9932,0.3800,-7.0000,-0.0000,10.9932,0.3800,-7.0000,0.0000,10.9932,0.3800,-7.0000,-0.0000,0.0000},
				{0.0200,30.9980,-11.2000,10.9980,0.2400,-7.0000,0.0000,10.9980,0.2400,-7.0000,0.0000,10.9980,0.2400,-7.0000,0.0000,0.0000},
				{0.0200,31.0000,-11.2000,11.0000,0.1000,-7.0000,-0.0000,11.0000,0.1000,-7.0000,0.0000,11.0000,0.1000,-7.0000,-0.0000,0.0000},
				{0.0200,30.9992,-11.2000,11.0008,0.0400,-3.0000,200.0000,10.9992,-0.0400,-7.0000,0.0000,11.0008,0.0400,-3.0000,200.0000,0.0000},

	    };

	@Override
	public double[][] getPath() {
	    return points;
	}
}