// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Transgender: ImageVector
  get() {
    val current = _transgender
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Transgender",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M22 2 v2 h4.59 l-6.4 6.4 a6.95 6.95 0 0 0 -8.37 0 L10.42 9 13 6.41 11.59 5 9 7.59 5.41 4 H10 V2 H2 v8 h2 V5.41 L7.59 9 5 11.59 6.41 13 9 10.41 l1.4 1.4 A6.98 6.98 0 0 0 15 22.93 V25 h-4 v2 h4 v3 h2 v-3 h4 v-2 h-4 v-2.08 a6.98 6.98 0 0 0 4.6 -11.1 l6.4 -6.4 V10 h2 V2Z m-6 19 a5 5 0 1 1 5 -5 5 5 0 0 1 -5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 2
          moveTo(x = 22.0f, y = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4.59
          horizontalLineToRelative(dx = 4.59f)
          // l -6.4 6.4
          lineToRelative(dx = -6.4f, dy = 6.4f)
          // a 6.95 6.95 0 0 0 -8.37 0
          arcToRelative(
            a = 6.95f,
            b = 6.95f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -8.37f,
            dy1 = 0.0f,
          )
          // L 10.42 9
          lineTo(x = 10.42f, y = 9.0f)
          // L 13 6.41
          lineTo(x = 13.0f, y = 6.41f)
          // L 11.59 5
          lineTo(x = 11.59f, y = 5.0f)
          // L 9 7.59
          lineTo(x = 9.0f, y = 7.59f)
          // L 5.41 4
          lineTo(x = 5.41f, y = 4.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 5.41
          verticalLineTo(y = 5.41f)
          // L 7.59 9
          lineTo(x = 7.59f, y = 9.0f)
          // L 5 11.59
          lineTo(x = 5.0f, y = 11.59f)
          // L 6.41 13
          lineTo(x = 6.41f, y = 13.0f)
          // L 9 10.41
          lineTo(x = 9.0f, y = 10.41f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // A 6.98 6.98 0 0 0 15 22.93
          arcTo(
            horizontalEllipseRadius = 6.98f,
            verticalEllipseRadius = 6.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 22.93f,
          )
          // V 25
          verticalLineTo(y = 25.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2.08
          verticalLineToRelative(dy = -2.08f)
          // a 6.98 6.98 0 0 0 4.6 -11.1
          arcToRelative(
            a = 6.98f,
            b = 6.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.6f,
            dy1 = -11.1f,
          )
          // l 6.4 -6.4
          lineToRelative(dx = 6.4f, dy = -6.4f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 2z
          verticalLineTo(y = 2.0f)
          close()
          // m -6 19
          moveToRelative(dx = -6.0f, dy = 19.0f)
          // a 5 5 0 1 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // a 5 5 0 0 1 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
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
      .also { _transgender = it }
  }

@Suppress("ObjectPropertyName")
private var _transgender: ImageVector? = null
