/*
 * Copyright 2017 "TeamBlitz Robotics Club"
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.usfirst.frc.team2083.robot.commands.auto;

import org.usfirst.frc.team2083.robot.commands.CommandBase;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCommandRightTowerLift extends CommandGroup {
    
    public  AutoCommandRightTowerLift() {    	
    	requires(CommandBase.leftDrive);
    	requires(CommandBase.rightDrive);
    	
     	addSequential(new AutoCommandDrive((long) (2.3*1000), 3));
//       	addSequential(new AutoCommandMoveArm((long)1.5*1000, -0.25));
     	addSequential(new AutoCommandDrive((long) (1*1000), -3));
       	
    }
}
