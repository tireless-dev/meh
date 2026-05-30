// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TaskApproved: ImageVector
  get() {
    val current = _taskApproved
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TaskApproved",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 20 a6 6 0 1 0 -10 4.46 V32 l4 -1.9 4 1.9 v-7.54 A6 6 0 0 0 30 20 m-4 8.84 -2 -.95 -2 .95 v-3.19 a6 6 0 0 0 4 0Z M24 24 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 20
          moveTo(x = 30.0f, y = 20.0f)
          // a 6 6 0 1 0 -10 4.46
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -10.0f,
            dy1 = 4.46f,
          )
          // V 32
          verticalLineTo(y = 32.0f)
          // l 4 -1.9
          lineToRelative(dx = 4.0f, dy = -1.9f)
          // l 4 1.9
          lineToRelative(dx = 4.0f, dy = 1.9f)
          // v -7.54
          verticalLineToRelative(dy = -7.54f)
          // A 6 6 0 0 0 30 20
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 30.0f,
            y1 = 20.0f,
          )
          // m -4 8.84
          moveToRelative(dx = -4.0f, dy = 8.84f)
          // l -2 -0.95
          lineToRelative(dx = -2.0f, dy = -0.95f)
          // l -2 0.95
          lineToRelative(dx = -2.0f, dy = 0.95f)
          // v -3.19
          verticalLineToRelative(dy = -3.19f)
          // a 6 6 0 0 0 4 0z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.0f,
            dy1 = 0.0f,
          )
          close()
          // M 24 24
          moveTo(x = 24.0f, y = 24.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
        }
        // M25 5 h-3 V4 a2 2 0 0 0 -2 -2 h-8 a2 2 0 0 0 -2 2 v1 H7 a2 2 0 0 0 -2 2 v21 a2 2 0 0 0 2 2 h9 v-2 H7 V7 h3 v3 h12 V7 h3 v5 h2 V7 a2 2 0 0 0 -2 -2 m-5 3 h-8 V4 h8Z
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
          // h 9
          horizontalLineToRelative(dx = 9.0f)
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
      .also { _taskApproved = it }
  }

@Suppress("ObjectPropertyName")
private var _taskApproved: ImageVector? = null
