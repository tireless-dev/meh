// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeploymentUnitTechnicalInstallation: ImageVector
  get() {
    val current = _deploymentUnitTechnicalInstallation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeploymentUnitTechnicalInstallation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="17.0 11.0 20.0 11.0 20.0 21.0 17.0 21.0 17.0 23.0 25.0 23.0 25.0 21.0 22.0 21.0 22.0 11.0 25.0 11.0 25.0 9.0 17.0 9.0 17.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 11
          moveTo(x = 17.0f, y = 11.0f)
          // L 20 11
          lineTo(x = 20.0f, y = 11.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 17 21
          lineTo(x = 17.0f, y = 21.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 22 21
          lineTo(x = 22.0f, y = 21.0f)
          // L 22 11
          lineTo(x = 22.0f, y = 11.0f)
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // L 25 9
          lineTo(x = 25.0f, y = 9.0f)
          // L 17 9
          lineTo(x = 17.0f, y = 9.0f)
          // L 17 11z
          lineTo(x = 17.0f, y = 11.0f)
          close()
        }
        // <polygon points="7.0 11.0 10.0 11.0 10.0 23.0 12.0 23.0 12.0 11.0 15.0 11.0 15.0 9.0 7.0 9.0 7.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7 11
          moveTo(x = 7.0f, y = 11.0f)
          // L 10 11
          lineTo(x = 10.0f, y = 11.0f)
          // L 10 23
          lineTo(x = 10.0f, y = 23.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 12 11
          lineTo(x = 12.0f, y = 11.0f)
          // L 15 11
          lineTo(x = 15.0f, y = 11.0f)
          // L 15 9
          lineTo(x = 15.0f, y = 9.0f)
          // L 7 9
          lineTo(x = 7.0f, y = 9.0f)
          // L 7 11z
          lineTo(x = 7.0f, y = 11.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 0 0
          moveTo(x = 0.0f, y = 0.0f)
          // h 32
          horizontalLineToRelative(dx = 32.0f)
          // v 32
          verticalLineToRelative(dy = 32.0f)
          // h -32z
        horizontalLineToRelative(dx = -32.0f)
        close()
      }
    }.build()
      .also { _deploymentUnitTechnicalInstallation = it }
  }

@Suppress("ObjectPropertyName")
private var _deploymentUnitTechnicalInstallation: ImageVector? = null
