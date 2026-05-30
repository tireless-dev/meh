// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CopyFile: ImageVector
  get() {
    val current = _copyFile
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CopyFile",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m27.4 14.7 -6.1 -6.1 A1.6 1.6 0 0 0 20 8 h-8 a2 2 0 0 0 -2 2 v18 a2 2 0 0 0 2 2 h14 a2 2 0 0 0 2 -2 V16.1 c0 -.5 -.2 -1 -.6 -1.4 M20 10 l5.9 6 H20z m-8 18 V10 h6 v6 a2 2 0 0 0 2 2 h6 v10z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.4 14.7
          moveTo(x = 27.4f, y = 14.7f)
          // l -6.1 -6.1
          lineToRelative(dx = -6.1f, dy = -6.1f)
          // A 1.6 1.6 0 0 0 20 8
          arcTo(
            horizontalEllipseRadius = 1.6f,
            verticalEllipseRadius = 1.6f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 8.0f,
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
          // h 14
          horizontalLineToRelative(dx = 14.0f)
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
          // V 16.1
          verticalLineTo(y = 16.1f)
          // c 0 -0.5 -0.2 -1 -0.6 -1.4
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.5f,
            dx2 = -0.2f,
            dy2 = -1.0f,
            dx3 = -0.6f,
            dy3 = -1.4f,
          )
          // M 20 10
          moveTo(x = 20.0f, y = 10.0f)
          // l 5.9 6
          lineToRelative(dx = 5.9f, dy = 6.0f)
          // H 20z
          horizontalLineTo(x = 20.0f)
          close()
          // m -8 18
          moveToRelative(dx = -8.0f, dy = 18.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 10z
          verticalLineToRelative(dy = 10.0f)
          close()
        }
        // M6 18 H4 V4 a2 2 0 0 1 2 -2 h14 v2 H6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 18
          moveTo(x = 6.0f, y = 18.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
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
      .also { _copyFile = it }
  }

@Suppress("ObjectPropertyName")
private var _copyFile: ImageVector? = null
