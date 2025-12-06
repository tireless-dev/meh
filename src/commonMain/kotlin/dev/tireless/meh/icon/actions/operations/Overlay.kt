// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Overlay: ImageVector
  get() {
    val current = _overlay
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Overlay",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 8 h-4 V4 a2 2 0 0 0 -2 -2 H4 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h4 v4 a2 2 0 0 0 2 2 h18 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 -2 -2 M4 22 V4 h18 v4 H10 a2 2 0 0 0 -2 2 v12Z m18 0 h-2.59 L10 12.59 V10 h2.59 L22 19.42Z m-12 -6.59 L16.59 22 H10Z m12 1.18 L15.41 10 H22Z M10 28 v-4 h12 a2 2 0 0 0 2 -2 V10 h4 v18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 8
          moveTo(x = 28.0f, y = 8.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
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
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 18
          verticalLineToRelative(dy = 18.0f)
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
          // v 4
          verticalLineToRelative(dy = 4.0f)
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
          // h 18
          horizontalLineToRelative(dx = 18.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
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
          // M 4 22
          moveTo(x = 4.0f, y = 22.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 18
          horizontalLineToRelative(dx = 18.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // v 12z
          verticalLineToRelative(dy = 12.0f)
          close()
          // m 18 0
          moveToRelative(dx = 18.0f, dy = 0.0f)
          // h -2.59
          horizontalLineToRelative(dx = -2.59f)
          // L 10 12.59
          lineTo(x = 10.0f, y = 12.59f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 2.59
          horizontalLineToRelative(dx = 2.59f)
          // L 22 19.42z
          lineTo(x = 22.0f, y = 19.42f)
          close()
          // m -12 -6.59
          moveToRelative(dx = -12.0f, dy = -6.59f)
          // L 16.59 22
          lineTo(x = 16.59f, y = 22.0f)
          // H 10z
          horizontalLineTo(x = 10.0f)
          close()
          // m 12 1.18
          moveToRelative(dx = 12.0f, dy = 1.18f)
          // L 15.41 10
          lineTo(x = 15.41f, y = 10.0f)
          // H 22z
          horizontalLineTo(x = 22.0f)
          close()
          // M 10 28
          moveTo(x = 10.0f, y = 28.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
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
          // V 10
          verticalLineTo(y = 10.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 18z
          verticalLineToRelative(dy = 18.0f)
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
      .also { _overlay = it }
  }

@Suppress("ObjectPropertyName")
private var _overlay: ImageVector? = null
