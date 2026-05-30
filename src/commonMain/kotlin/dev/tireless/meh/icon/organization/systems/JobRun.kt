// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val JobRun: ImageVector
  get() {
    val current = _jobRun
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.JobRun",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M12 17 h8 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v11 a2 2 0 0 0 2 2 m0 -13 h8 v11 h-8z M8 19 h6 v2 H8 a2 2 0 0 1 -2 -2 V8 h2z m-4 4 h6 v2 H4 a2 2 0 0 1 -2 -2 V12 h2z m26 1 -6 6 -1.4 -1.4 3.6 -3.6 H17 v-2 h9.2 l-3.6 -3.6 L24 18z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 12 17
          moveTo(x = 12.0f, y = 17.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // m 0 -13
          moveToRelative(dx = 0.0f, dy = -13.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // M 8 19
          moveTo(x = 8.0f, y = 19.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m -4 4
          moveToRelative(dx = -4.0f, dy = 4.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // V 12
          verticalLineTo(y = 12.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
          // m 26 1
          moveToRelative(dx = 26.0f, dy = 1.0f)
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l 3.6 -3.6
          lineToRelative(dx = 3.6f, dy = -3.6f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 9.2
          horizontalLineToRelative(dx = 9.2f)
          // l -3.6 -3.6
          lineToRelative(dx = -3.6f, dy = -3.6f)
          // L 24 18z
          lineTo(x = 24.0f, y = 18.0f)
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
      .also { _jobRun = it }
  }

@Suppress("ObjectPropertyName")
private var _jobRun: ImageVector? = null
