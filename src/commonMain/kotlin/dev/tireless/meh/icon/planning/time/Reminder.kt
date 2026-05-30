// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Reminder: ImageVector
  get() {
    val current = _reminder
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Reminder",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m30 23.38 -2 -1 V20 a6 6 0 0 0 -5 -5.91 V12 h-2 v2.09 A6 6 0 0 0 16 20 v2.38 l-2 1 V28 h6 v2 h4 v-2 h6Z M28 26 H16 v-1.38 l2 -1 V20 a4 4 0 0 1 8 0 v3.62 l2 1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 23.38
          moveTo(x = 30.0f, y = 23.38f)
          // l -2 -1
          lineToRelative(dx = -2.0f, dy = -1.0f)
          // V 20
          verticalLineTo(y = 20.0f)
          // a 6 6 0 0 0 -5 -5.91
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.91f,
          )
          // V 12
          verticalLineTo(y = 12.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.09
          verticalLineToRelative(dy = 2.09f)
          // A 6 6 0 0 0 16 20
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 20.0f,
          )
          // v 2.38
          verticalLineToRelative(dy = 2.38f)
          // l -2 1
          lineToRelative(dx = -2.0f, dy = 1.0f)
          // V 28
          verticalLineTo(y = 28.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // M 28 26
          moveTo(x = 28.0f, y = 26.0f)
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -1.38
          verticalLineToRelative(dy = -1.38f)
          // l 2 -1
          lineToRelative(dx = 2.0f, dy = -1.0f)
          // V 20
          verticalLineTo(y = 20.0f)
          // a 4 4 0 0 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // v 3.62
          verticalLineToRelative(dy = 3.62f)
          // l 2 1z
          lineToRelative(dx = 2.0f, dy = 1.0f)
          close()
        }
        // M28 6 a2 2 0 0 0 -2 -2 h-4 V2 h-2 v2 h-8 V2 h-2 v2 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h4 v-2 H6 V6 h4 v2 h2 V6 h8 v2 h2 V6 h4 v6 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _reminder = it }
  }

@Suppress("ObjectPropertyName")
private var _reminder: ImageVector? = null
