// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentConfiguration: ImageVector
  get() {
    val current = _documentConfiguration
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentConfiguration",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 24 v-2 h-2.1 a5 5 0 0 0 -.73 -1.75 l1.49 -1.5 -1.42 -1.4 -1.49 1.48 A5 5 0 0 0 24 18.1 V16 h-2 v2.1 a5 5 0 0 0 -1.75 .73 l-1.5 -1.49 -1.4 1.42 1.48 1.49 A5 5 0 0 0 18.1 22 H16 v2 h2.1 a5 5 0 0 0 .73 1.75 l-1.49 1.5 1.42 1.4 1.49 -1.48 A5 5 0 0 0 22 27.9 V30 h2 v-2.1 a5 5 0 0 0 1.75 -.73 l1.5 1.49 1.4 -1.42 -1.48 -1.49 A5 5 0 0 0 27.9 24z m-7 2 a3 3 0 1 1 0 -6 3 3 0 0 1 0 6
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 24
          moveTo(x = 30.0f, y = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.1
          horizontalLineToRelative(dx = -2.1f)
          // a 5 5 0 0 0 -0.73 -1.75
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.73f,
            dy1 = -1.75f,
          )
          // l 1.49 -1.5
          lineToRelative(dx = 1.49f, dy = -1.5f)
          // l -1.42 -1.4
          lineToRelative(dx = -1.42f, dy = -1.4f)
          // l -1.49 1.48
          lineToRelative(dx = -1.49f, dy = 1.48f)
          // A 5 5 0 0 0 24 18.1
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 18.1f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.1
          verticalLineToRelative(dy = 2.1f)
          // a 5 5 0 0 0 -1.75 0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.75f,
            dy1 = 0.73f,
          )
          // l -1.5 -1.49
          lineToRelative(dx = -1.5f, dy = -1.49f)
          // l -1.4 1.42
          lineToRelative(dx = -1.4f, dy = 1.42f)
          // l 1.48 1.49
          lineToRelative(dx = 1.48f, dy = 1.49f)
          // A 5 5 0 0 0 18.1 22
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.1f,
            y1 = 22.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.1
          horizontalLineToRelative(dx = 2.1f)
          // a 5 5 0 0 0 0.73 1.75
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.73f,
            dy1 = 1.75f,
          )
          // l -1.49 1.5
          lineToRelative(dx = -1.49f, dy = 1.5f)
          // l 1.42 1.4
          lineToRelative(dx = 1.42f, dy = 1.4f)
          // l 1.49 -1.48
          lineToRelative(dx = 1.49f, dy = -1.48f)
          // A 5 5 0 0 0 22 27.9
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 27.9f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.1
          verticalLineToRelative(dy = -2.1f)
          // a 5 5 0 0 0 1.75 -0.73
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.75f,
            dy1 = -0.73f,
          )
          // l 1.5 1.49
          lineToRelative(dx = 1.5f, dy = 1.49f)
          // l 1.4 -1.42
          lineToRelative(dx = 1.4f, dy = -1.42f)
          // l -1.48 -1.49
          lineToRelative(dx = -1.48f, dy = -1.49f)
          // A 5 5 0 0 0 27.9 24z
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.9f,
            y1 = 24.0f,
          )
          close()
          // m -7 2
          moveToRelative(dx = -7.0f, dy = 2.0f)
          // a 3 3 0 1 1 0 -6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -6.0f,
          )
          // a 3 3 0 0 1 0 6
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 6.0f,
          )
        }
        // m23.5 9.09 -6.8 -6.8 A1 1 0 0 0 16 2 H6 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h8 v-2 H6 V4 h8 v6 a2 2 0 0 0 2 2 h6.3 a1.7 1.7 0 0 0 1.2 -2.91 M16 10 V4.41 L21.59 10z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.5 9.09
          moveTo(x = 23.5f, y = 9.09f)
          // l -6.8 -6.8
          lineToRelative(dx = -6.8f, dy = -6.8f)
          // A 1 1 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // h 6.3
          horizontalLineToRelative(dx = 6.3f)
          // a 1.7 1.7 0 0 0 1.2 -2.91
          arcToRelative(
            a = 1.7f,
            b = 1.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.2f,
            dy1 = -2.91f,
          )
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // V 4.41
          verticalLineTo(y = 4.41f)
          // L 21.59 10z
          lineTo(x = 21.59f, y = 10.0f)
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
      .also { _documentConfiguration = it }
  }

@Suppress("ObjectPropertyName")
private var _documentConfiguration: ImageVector? = null
