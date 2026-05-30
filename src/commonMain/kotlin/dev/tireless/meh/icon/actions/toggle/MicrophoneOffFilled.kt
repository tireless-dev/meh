// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicrophoneOffFilled: ImageVector
  get() {
    val current = _microphoneOffFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MicrophoneOffFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 17 a7 7 0 0 1 -11.73 5.14 l1.42 -1.41 A5 5 0 0 0 21 17 v-4.58 l9 -9 L28.59 2 2 28.59 3.41 30 l6.44 -6.44 A9 9 0 0 0 15 25.94 V28 h-4 v2 h10 v-2 h-4 v-2.06 A9 9 0 0 0 25 17 v-3 h-2Z M9 17.32 V14 H7 v3 a9 9 0 0 0 .25 2.09Z M20.76 5.58 A5 5 0 0 0 11 7 v8.34Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 17
          moveTo(x = 23.0f, y = 17.0f)
          // a 7 7 0 0 1 -11.73 5.14
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -11.73f,
            dy1 = 5.14f,
          )
          // l 1.42 -1.41
          lineToRelative(dx = 1.42f, dy = -1.41f)
          // A 5 5 0 0 0 21 17
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 17.0f,
          )
          // v -4.58
          verticalLineToRelative(dy = -4.58f)
          // l 9 -9
          lineToRelative(dx = 9.0f, dy = -9.0f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 6.44 -6.44
          lineToRelative(dx = 6.44f, dy = -6.44f)
          // A 9 9 0 0 0 15 25.94
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
            y1 = 25.94f,
          )
          // V 28
          verticalLineTo(y = 28.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -2.06
          verticalLineToRelative(dy = -2.06f)
          // A 9 9 0 0 0 25 17
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 17.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
          // M 9 17.32
          moveTo(x = 9.0f, y = 17.32f)
          // V 14
          verticalLineTo(y = 14.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 9 9 0 0 0 0.25 2.09z
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.25f,
            dy1 = 2.09f,
          )
          close()
          // M 20.76 5.58
          moveTo(x = 20.76f, y = 5.58f)
          // A 5 5 0 0 0 11 7
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 7.0f,
          )
          // v 8.34z
          verticalLineToRelative(dy = 8.34f)
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
      .also { _microphoneOffFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _microphoneOffFilled: ImageVector? = null
