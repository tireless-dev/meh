// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildTool: ImageVector
  get() {
    val current = _buildTool
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.BuildTool",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28 14 h-1 V7 a2 2 0 0 0 -2 -2 h-6 v2 h6 v7 h-1 a2 2 0 0 0 -2 2 v9 H9.9 A4.2 4.2 0 0 0 7 22.1 V7 h6.2 l-2.6 2.6 L12 11 l5 -5 -5 -5 -1.4 1.4 L13.2 5 H7 a2 2 0 0 0 -2 2 v15.1 A4.01 4.01 0 1 0 9.9 27 H22 v1 a2 2 0 0 0 2 2 h4 a2 2 0 0 0 2 -2 V16 a2 2 0 0 0 -2 -2 M6 28 c-1.1 0 -2 -.9 -2 -2 s.9 -2 2 -2 2 .9 2 2 -.9 2 -2 2 m18 0 V16 h4 v12z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 14
          moveTo(x = 28.0f, y = 14.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 7
          verticalLineTo(y = 7.0f)
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
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
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
          // v 9
          verticalLineToRelative(dy = 9.0f)
          // H 9.9
          horizontalLineTo(x = 9.9f)
          // A 4.2 4.2 0 0 0 7 22.1
          arcTo(
            horizontalEllipseRadius = 4.2f,
            verticalEllipseRadius = 4.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 22.1f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // h 6.2
          horizontalLineToRelative(dx = 6.2f)
          // l -2.6 2.6
          lineToRelative(dx = -2.6f, dy = 2.6f)
          // L 12 11
          lineTo(x = 12.0f, y = 11.0f)
          // l 5 -5
          lineToRelative(dx = 5.0f, dy = -5.0f)
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // L 13.2 5
          lineTo(x = 13.2f, y = 5.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // v 15.1
          verticalLineToRelative(dy = 15.1f)
          // A 4.01 4.01 0 1 0 9.9 27
          arcTo(
            horizontalEllipseRadius = 4.01f,
            verticalEllipseRadius = 4.01f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 9.9f,
            y1 = 27.0f,
          )
          // H 22
          horizontalLineTo(x = 22.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // M 6 28
          moveTo(x = 6.0f, y = 28.0f)
          // c -1.1 0 -2 -0.9 -2 -2
          curveToRelative(
            dx1 = -1.1f,
            dy1 = 0.0f,
            dx2 = -2.0f,
            dy2 = -0.9f,
            dx3 = -2.0f,
            dy3 = -2.0f,
          )
          // s 0.9 -2 2 -2
          reflectiveCurveToRelative(
            dx1 = 0.9f,
            dy1 = -2.0f,
            dx2 = 2.0f,
            dy2 = -2.0f,
          )
          // s 2 0.9 2 2
          reflectiveCurveToRelative(
            dx1 = 2.0f,
            dy1 = 0.9f,
            dx2 = 2.0f,
            dy2 = 2.0f,
          )
          // s -0.9 2 -2 2
          reflectiveCurveToRelative(
            dx1 = -0.9f,
            dy1 = 2.0f,
            dx2 = -2.0f,
            dy2 = 2.0f,
          )
          // m 18 0
          moveToRelative(dx = 18.0f, dy = 0.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 12z
          verticalLineToRelative(dy = 12.0f)
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
      .also { _buildTool = it }
  }

@Suppress("ObjectPropertyName")
private var _buildTool: ImageVector? = null
