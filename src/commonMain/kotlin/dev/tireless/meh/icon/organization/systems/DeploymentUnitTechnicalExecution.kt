// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DeploymentUnitTechnicalExecution: ImageVector
  get() {
    val current = _deploymentUnitTechnicalExecution
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DeploymentUnitTechnicalExecution",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.0 11.0 25.0 9.0 17.0 9.0 17.0 23.0 25.0 23.0 25.0 21.0 19.0 21.0 19.0 17.0 24.0 17.0 24.0 15.0 19.0 15.0 19.0 11.0 25.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 11
          moveTo(x = 25.0f, y = 11.0f)
          // L 25 9
          lineTo(x = 25.0f, y = 9.0f)
          // L 17 9
          lineTo(x = 17.0f, y = 9.0f)
          // L 17 23
          lineTo(x = 17.0f, y = 23.0f)
          // L 25 23
          lineTo(x = 25.0f, y = 23.0f)
          // L 25 21
          lineTo(x = 25.0f, y = 21.0f)
          // L 19 21
          lineTo(x = 19.0f, y = 21.0f)
          // L 19 17
          lineTo(x = 19.0f, y = 17.0f)
          // L 24 17
          lineTo(x = 24.0f, y = 17.0f)
          // L 24 15
          lineTo(x = 24.0f, y = 15.0f)
          // L 19 15
          lineTo(x = 19.0f, y = 15.0f)
          // L 19 11
          lineTo(x = 19.0f, y = 11.0f)
          // L 25 11z
          lineTo(x = 25.0f, y = 11.0f)
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
      .also { _deploymentUnitTechnicalExecution = it }
  }

@Suppress("ObjectPropertyName")
private var _deploymentUnitTechnicalExecution: ImageVector? = null
