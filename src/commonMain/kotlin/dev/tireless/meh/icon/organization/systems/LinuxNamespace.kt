// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinuxNamespace: ImageVector
  get() {
    val current = _linuxNamespace
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LinuxNamespace",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="28" x="26.0" y="2.0" fill="#000" stroke-width="0" />
        path(
          fill = SolidColor(Color(0xFF000000)),
          strokeLineWidth = 0.0f,
        ) {
          // M 26 2
          moveTo(x = 26.0f, y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 28
          verticalLineToRelative(dy = 28.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M20 25 H6 a2 2 0 0 1 -2 -2 V9 a2 2 0 0 1 2 -2 h14 a2 2 0 0 1 2 2 v14 a2 2 0 0 1 -2 2 m0 -16 H6 v14 h14z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 25
          moveTo(x = 20.0f, y = 25.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 9
          verticalLineTo(y = 9.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 0 -16
          moveToRelative(dx = 0.0f, dy = -16.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 14z
          horizontalLineToRelative(dx = 14.0f)
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none;stroke-width:0" stroke-width="0" />
        path(
          fill = SolidColor(Color.Transparent),
          strokeLineWidth = 0.0f,
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
      .also { _linuxNamespace = it }
  }

@Suppress("ObjectPropertyName")
private var _linuxNamespace: ImageVector? = null
