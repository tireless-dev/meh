// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AiBusinessImpactAssessment: ImageVector
  get() {
    val current = _aiBusinessImpactAssessment
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AiBusinessImpactAssessment",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="8" x="24.0" y="23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 23
          moveTo(x = 24.0f, y = 23.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="10" x="28.0" y="21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 21
          moveTo(x = 28.0f, y = 21.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="4" x="20.0" y="27.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 27
          moveTo(x = 20.0f, y = 27.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M18 20 v-2 h1 v-7 h-1 V9 h4 v2 h-1 v7 h1 v2z m-3.5 0 h2 L13 9 h-3 L6.5 20 h2 l.6 -2 h4.78z m-4.8 -4 1.63 -5.41 h.26 L13.26 16z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 20
          moveTo(x = 18.0f, y = 20.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 2z
          verticalLineToRelative(dy = 2.0f)
          close()
          // m -3.5 0
          moveToRelative(dx = -3.5f, dy = 0.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // L 13 9
          lineTo(x = 13.0f, y = 9.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // L 6.5 20
          lineTo(x = 6.5f, y = 20.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // l 0.6 -2
          lineToRelative(dx = 0.6f, dy = -2.0f)
          // h 4.78z
          horizontalLineToRelative(dx = 4.78f)
          close()
          // m -4.8 -4
          moveToRelative(dx = -4.8f, dy = -4.0f)
          // l 1.63 -5.41
          lineToRelative(dx = 1.63f, dy = -5.41f)
          // h 0.26
          horizontalLineToRelative(dx = 0.26f)
          // L 13.26 16z
          lineTo(x = 13.26f, y = 16.0f)
          close()
        }
        // <polygon points="17.0 30.0 0.0 30.0 0.0 0.0 30.0 0.0 30.0 17.0 28.0 17.0 28.0 2.0 2.0 2.0 2.0 28.0 17.0 28.0 17.0 30.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 30
          moveTo(x = 17.0f, y = 30.0f)
          // L 0 30
          lineTo(x = 0.0f, y = 30.0f)
          // L 0 0
          lineTo(x = 0.0f, y = 0.0f)
          // L 30 0
          lineTo(x = 30.0f, y = 0.0f)
          // L 30 17
          lineTo(x = 30.0f, y = 17.0f)
          // L 28 17
          lineTo(x = 28.0f, y = 17.0f)
          // L 28 2
          lineTo(x = 28.0f, y = 2.0f)
          // L 2 2
          lineTo(x = 2.0f, y = 2.0f)
          // L 2 28
          lineTo(x = 2.0f, y = 28.0f)
          // L 17 28
          lineTo(x = 17.0f, y = 28.0f)
          // L 17 30z
          lineTo(x = 17.0f, y = 30.0f)
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
      .also { _aiBusinessImpactAssessment = it }
  }

@Suppress("ObjectPropertyName")
private var _aiBusinessImpactAssessment: ImageVector? = null
