// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ManageProtection: ImageVector
  get() {
    val current = _manageProtection
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ManageProtection",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m16 30 -6.18 -3.3 A11 11 0 0 1 4 17 V4 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v13 a11 11 0 0 1 -5.82 9.7Z M6 4 v13 a9 9 0 0 0 4.77 7.94 l5.23 2.8 5.23 -2.8 A9 9 0 0 0 26 17 V4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // l -6.18 -3.3
          lineToRelative(dx = -6.18f, dy = -3.3f)
          // A 11 11 0 0 1 4 17
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 17.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
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
          // h 20
          horizontalLineToRelative(dx = 20.0f)
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
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // a 11 11 0 0 1 -5.82 9.7z
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.82f,
            dy1 = 9.7f,
          )
          close()
          // M 6 4
          moveTo(x = 6.0f, y = 4.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // a 9 9 0 0 0 4.77 7.94
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.77f,
            dy1 = 7.94f,
          )
          // l 5.23 2.8
          lineToRelative(dx = 5.23f, dy = 2.8f)
          // l 5.23 -2.8
          lineToRelative(dx = 5.23f, dy = -2.8f)
          // A 9 9 0 0 0 26 17
          arcTo(
            horizontalEllipseRadius = 9.0f,
            verticalEllipseRadius = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 17.0f,
          )
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
        }
        // M16 25.28 V6 h8 v10.8 a7 7 0 0 1 -3.7 6.18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 25.28
          moveTo(x = 16.0f, y = 25.28f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 10.8
          verticalLineToRelative(dy = 10.8f)
          // a 7 7 0 0 1 -3.7 6.18z
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.7f,
            dy1 = 6.18f,
          )
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
      .also { _manageProtection = it }
  }

@Suppress("ObjectPropertyName")
private var _manageProtection: ImageVector? = null
