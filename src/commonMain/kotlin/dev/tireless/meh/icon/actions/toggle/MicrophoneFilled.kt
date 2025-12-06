// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MicrophoneFilled: ImageVector
  get() {
    val current = _microphoneFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MicrophoneFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 14 v3 a7 7 0 0 1 -14 0 v-3 H7 v3 a9 9 0 0 0 8 8.94 V28 h-4 v2 h10 v-2 h-4 v-2.06 A9 9 0 0 0 25 17 v-3Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 14
          moveTo(x = 23.0f, y = 14.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 7 7 0 0 1 -14 0
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -14.0f,
            dy1 = 0.0f,
          )
          // v -3
          verticalLineToRelative(dy = -3.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 9 9 0 0 0 8 8.94
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 8.0f,
            dy1 = 8.94f,
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
          // v -3z
          verticalLineToRelative(dy = -3.0f)
          close()
        }
        // M16 22 a5 5 0 0 0 5 -5 V7 a5 5 0 0 0 -10 0 v10 a5 5 0 0 0 5 5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 22
          moveTo(x = 16.0f, y = 22.0f)
          // a 5 5 0 0 0 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 5 5 0 0 0 -10 0
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -10.0f,
            dy1 = 0.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 5 5 0 0 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.0f,
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
      .also { _microphoneFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _microphoneFilled: ImageVector? = null
