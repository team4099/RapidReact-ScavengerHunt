package com.team4099.robot2022.commands.pneumatics

import com.team4099.robot2022.subsystems.pneumatics.Pneumatic
import edu.wpi.first.wpilibj2.command.CommandBase
import org.littletonrobotics.junction.Logger

class PneumaticIdleCommand(val pneumatic: Pneumatic) : CommandBase() {
  init {
    addRequirements(pneumatic)
  }

  override fun initialize() {
    pneumatic.allowLowPressure = false
  }

  override fun execute() {
    Logger.getInstance().recordOutput("ActiveCommands/PneumaticIdleCommand", true)
  }

  override fun isFinished(): Boolean {
    return false
  }
}
