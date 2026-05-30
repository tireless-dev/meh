// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeploymentUnitExecution: ImageVector
  get() {
    val current = _deploymentUnitExecution
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeploymentUnitExecution",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="20.0 11.0 20.0 9.0 12.0 9.0 12.0 23.0 20.0 23.0 20.0 21.0 14.0 21.0 14.0 17.0 19.0 17.0 19.0 15.0 14.0 15.0 14.0 11.0 20.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 11
          moveTo(x = 20.0f, y = 11.0f)
          // L 20 9
          lineTo(x = 20.0f, y = 9.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 20 21
          lineTo(x = 20.0f, y = 21.0f)
          // L 14 21
          lineTo(x = 14.0f, y = 21.0f)
          // L 14 17
          lineTo(x = 14.0f, y = 17.0f)
          // L 19 17
          lineTo(x = 19.0f, y = 17.0f)
          // L 19 15
          lineTo(x = 19.0f, y = 15.0f)
          // L 14 15
          lineTo(x = 14.0f, y = 15.0f)
          // L 14 11
          lineTo(x = 14.0f, y = 11.0f)
          // L 20 11z
          lineTo(x = 20.0f, y = 11.0f)
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
      .also { _deploymentUnitExecution = it }
  }

@Suppress("ObjectPropertyName")
private var _deploymentUnitExecution: ImageVector? = null
