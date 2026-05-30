// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TaskTools: ImageVector
  get() {
    val current = _taskTools
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TaskTools",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M28.5 32 a3.5 3.5 0 0 1 -2.48 -1.03 l-4.12 -4.12 a6.5 6.5 0 0 1 -7.35 -8.96 l.59 -1.34 4.15 4.16 a1 1 0 0 0 1.42 0 1 1 0 0 0 0 -1.42 l-4.16 -4.15 1.34 -.6 a6.5 6.5 0 0 1 8.96 7.36 l4.12 4.13 A3.5 3.5 0 0 1 28.5 32 m-6.03 -7.4 4.97 4.96 a1.54 1.54 0 0 0 2.12 0 1.5 1.5 0 0 0 0 -2.12 l-4.97 -4.97 .19 -.58 A4.5 4.5 0 0 0 20.5 16 h-.25 l1.87 1.88 a3 3 0 0 1 0 4.24 3.07 3.07 0 0 1 -4.24 0 L16 20.25 16 20.5 a4.5 4.5 0 0 0 5.89 4.28Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28.5 32
          moveTo(x = 28.5f, y = 32.0f)
          // a 3.5 3.5 0 0 1 -2.48 -1.03
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.48f,
            dy1 = -1.03f,
          )
          // l -4.12 -4.12
          lineToRelative(dx = -4.12f, dy = -4.12f)
          // a 6.5 6.5 0 0 1 -7.35 -8.96
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -7.35f,
            dy1 = -8.96f,
          )
          // l 0.59 -1.34
          lineToRelative(dx = 0.59f, dy = -1.34f)
          // l 4.15 4.16
          lineToRelative(dx = 4.15f, dy = 4.16f)
          // a 1 1 0 0 0 1.42 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.42f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 0 0 -1.42
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.42f,
          )
          // l -4.16 -4.15
          lineToRelative(dx = -4.16f, dy = -4.15f)
          // l 1.34 -0.6
          lineToRelative(dx = 1.34f, dy = -0.6f)
          // a 6.5 6.5 0 0 1 8.96 7.36
          arcToRelative(
            a = 6.5f,
            b = 6.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 8.96f,
            dy1 = 7.36f,
          )
          // l 4.12 4.13
          lineToRelative(dx = 4.12f, dy = 4.13f)
          // A 3.5 3.5 0 0 1 28.5 32
          arcTo(
            horizontalEllipseRadius = 3.5f,
            verticalEllipseRadius = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.5f,
            y1 = 32.0f,
          )
          // m -6.03 -7.4
          moveToRelative(dx = -6.03f, dy = -7.4f)
          // l 4.97 4.96
          lineToRelative(dx = 4.97f, dy = 4.96f)
          // a 1.54 1.54 0 0 0 2.12 0
          arcToRelative(
            a = 1.54f,
            b = 1.54f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.12f,
            dy1 = 0.0f,
          )
          // a 1.5 1.5 0 0 0 0 -2.12
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.12f,
          )
          // l -4.97 -4.97
          lineToRelative(dx = -4.97f, dy = -4.97f)
          // l 0.19 -0.58
          lineToRelative(dx = 0.19f, dy = -0.58f)
          // A 4.5 4.5 0 0 0 20.5 16
          arcTo(
            horizontalEllipseRadius = 4.5f,
            verticalEllipseRadius = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.5f,
            y1 = 16.0f,
          )
          // h -0.25
          horizontalLineToRelative(dx = -0.25f)
          // l 1.87 1.88
          lineToRelative(dx = 1.87f, dy = 1.88f)
          // a 3 3 0 0 1 0 4.24
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.24f,
          )
          // a 3.07 3.07 0 0 1 -4.24 0
          arcToRelative(
            a = 3.07f,
            b = 3.07f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.24f,
            dy1 = 0.0f,
          )
          // L 16 20.25
          lineTo(x = 16.0f, y = 20.25f)
          // L 16 20.5
          lineTo(x = 16.0f, y = 20.5f)
          // a 4.5 4.5 0 0 0 5.89 4.28z
          arcToRelative(
            a = 4.5f,
            b = 4.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 5.89f,
            dy1 = 4.28f,
          )
          close()
        }
        // M25 5 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h7 v-2 H7 V7 h3 v3 h12 V7 h3 v5 h2 V7 a2 2 0 0 0 -2 -2 m-5 3 h-8 V4 h8Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25 5
          moveTo(x = 25.0f, y = 5.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
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
          // v 1
          verticalLineToRelative(dy = 1.0f)
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
          // v 21
          verticalLineToRelative(dy = 21.0f)
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
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7
          horizontalLineTo(x = 7.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
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
          // m -5 3
          moveToRelative(dx = -5.0f, dy = 3.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _taskTools = it }
  }

@Suppress("ObjectPropertyName")
private var _taskTools: ImageVector? = null
