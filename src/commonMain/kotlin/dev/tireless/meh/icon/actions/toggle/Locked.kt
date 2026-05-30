// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Locked: ImageVector
  get() {
    val current = _locked
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Locked",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 14 h-2 V8 a6 6 0 0 0 -12 0 v6 H8 a2 2 0 0 0 -2 2 v12 a2 2 0 0 0 2 2 h16 a2 2 0 0 0 2 -2 V16 a2 2 0 0 0 -2 -2 M12 8 a4 4 0 0 1 8 0 v6 h-8Z m12 20 H8 V16 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 14
          moveTo(x = 24.0f, y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // a 6 6 0 0 0 -12 0
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -12.0f,
            dy1 = 0.0f,
          )
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
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
          // h 16
          horizontalLineToRelative(dx = 16.0f)
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
          // V 16
          verticalLineTo(y = 16.0f)
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
          // M 12 8
          moveTo(x = 12.0f, y = 8.0f)
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
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
          // m 12 20
          moveToRelative(dx = 12.0f, dy = 20.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
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
      .also { _locked = it }
  }

@Suppress("ObjectPropertyName")
private var _locked: ImageVector? = null
