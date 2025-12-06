// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectoryDomain: ImageVector
  get() {
    val current = _directoryDomain
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DirectoryDomain",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 26 h-9.18 A3 3 0 0 0 17 24.18 V19 h7 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 H8 a2 2 0 0 0 -2 2 v13 a2 2 0 0 0 2 2 h7 v5.18 A3 3 0 0 0 13.18 26 H4 v2 h9.18 a2.98 2.98 0 0 0 5.64 0 H28Z m-4 -14 H8 V9 h16Z m0 -8 v3 H8 V4Z M8 14 h16 v3 H8Z m8 14 a1 1 0 1 1 1 -1 1 1 0 0 1 -1 1
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 26
          moveTo(x = 28.0f, y = 26.0f)
          // h -9.18
          horizontalLineToRelative(dx = -9.18f)
          // A 3 3 0 0 0 17 24.18
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 24.18f,
          )
          // V 19
          verticalLineTo(y = 19.0f)
          // h 7
          horizontalLineToRelative(dx = 7.0f)
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
          // v 13
          verticalLineToRelative(dy = 13.0f)
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
          // h 7
          horizontalLineToRelative(dx = 7.0f)
          // v 5.18
          verticalLineToRelative(dy = 5.18f)
          // A 3 3 0 0 0 13.18 26
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.18f,
            y1 = 26.0f,
          )
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 9.18
          horizontalLineToRelative(dx = 9.18f)
          // a 2.98 2.98 0 0 0 5.64 0
          arcToRelative(
            a = 2.98f,
            b = 2.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.64f,
            dy1 = 0.0f,
          )
          // H 28z
          horizontalLineTo(x = 28.0f)
          close()
          // m -4 -14
          moveToRelative(dx = -4.0f, dy = -14.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
          close()
          // m 0 -8
          moveToRelative(dx = 0.0f, dy = -8.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 8
          horizontalLineTo(x = 8.0f)
          // V 4z
          verticalLineTo(y = 4.0f)
          close()
          // M 8 14
          moveTo(x = 8.0f, y = 14.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 8 14
          moveToRelative(dx = 8.0f, dy = 14.0f)
          // a 1 1 0 1 1 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
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
      .also { _directoryDomain = it }
  }

@Suppress("ObjectPropertyName")
private var _directoryDomain: ImageVector? = null
