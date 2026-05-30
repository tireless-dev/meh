// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.ai

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ModelTuned: ImageVector
  get() {
    val current = _modelTuned
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ModelTuned",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M24 30 v-2.28 a2 2 0 0 0 0 -3.44 V20 h-2 v4.28 a2 2 0 0 0 0 3.44 V30z m7 -6 a2 2 0 0 0 -1 -1.72 V20 h-2 v2.28 a2 2 0 0 0 0 3.44 V30 h2 v-4.28 A2 2 0 0 0 31 24
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 30
          moveTo(x = 24.0f, y = 30.0f)
          // v -2.28
          verticalLineToRelative(dy = -2.28f)
          // a 2 2 0 0 0 0 -3.44
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.44f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 4.28
          verticalLineToRelative(dy = 4.28f)
          // a 2 2 0 0 0 0 3.44
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.44f,
          )
          // V 30z
          verticalLineTo(y = 30.0f)
          close()
          // m 7 -6
          moveToRelative(dx = 7.0f, dy = -6.0f)
          // a 2 2 0 0 0 -1 -1.72
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.72f,
          )
          // V 20
          verticalLineTo(y = 20.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.28
          verticalLineToRelative(dy = 2.28f)
          // a 2 2 0 0 0 0 3.44
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.44f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -4.28
          verticalLineToRelative(dy = -4.28f)
          // A 2 2 0 0 0 31 24
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 31.0f,
            y1 = 24.0f,
          )
        }
        // M7.82 17 h5.77 l-7.3 7.3 A3 3 0 1 0 5 30 a3 3 0 0 0 2.82 -2 H18 v-2 H7.82 L7.7 25.71 16.41 17 H26 v-1 a1 1 0 0 1 2 0 v1 h2 v-1 a3 3 0 0 0 -5.82 -1 h-5.77 l7.3 -7.3 A3 3 0 1 0 27 2 a3 3 0 0 0 -2.82 2 H7.82 a3 3 0 1 0 -1.53 3.7 l7.3 7.3 H7.82 a3 3 0 1 0 0 2 M5 26 a1 1 0 1 1 0 2 1 1 0 0 1 0 -2 m1 -10 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0 m18.3 -9.71 -8.3 8.3 -8.3 -8.3 L7.82 6 h16.36z M6 5 a1 1 0 1 1 -2 0 1 1 0 0 1 2 0 m21 1 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 7.82 17
          moveTo(x = 7.82f, y = 17.0f)
          // h 5.77
          horizontalLineToRelative(dx = 5.77f)
          // l -7.3 7.3
          lineToRelative(dx = -7.3f, dy = 7.3f)
          // A 3 3 0 1 0 5 30
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 30.0f,
          )
          // a 3 3 0 0 0 2.82 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.82f,
            dy1 = -2.0f,
          )
          // H 18
          horizontalLineTo(x = 18.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 7.82
          horizontalLineTo(x = 7.82f)
          // L 7.7 25.71
          lineTo(x = 7.7f, y = 25.71f)
          // L 16.41 17
          lineTo(x = 16.41f, y = 17.0f)
          // H 26
          horizontalLineTo(x = 26.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -1
          verticalLineToRelative(dy = -1.0f)
          // a 3 3 0 0 0 -5.82 -1
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.82f,
            dy1 = -1.0f,
          )
          // h -5.77
          horizontalLineToRelative(dx = -5.77f)
          // l 7.3 -7.3
          lineToRelative(dx = 7.3f, dy = -7.3f)
          // A 3 3 0 1 0 27 2
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 2.0f,
          )
          // a 3 3 0 0 0 -2.82 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.82f,
            dy1 = 2.0f,
          )
          // H 7.82
          horizontalLineTo(x = 7.82f)
          // a 3 3 0 1 0 -1.53 3.7
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -1.53f,
            dy1 = 3.7f,
          )
          // l 7.3 7.3
          lineToRelative(dx = 7.3f, dy = 7.3f)
          // H 7.82
          horizontalLineTo(x = 7.82f)
          // a 3 3 0 1 0 0 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // M 5 26
          moveTo(x = 5.0f, y = 26.0f)
          // a 1 1 0 1 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // a 1 1 0 0 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // m 1 -10
          moveToRelative(dx = 1.0f, dy = -10.0f)
          // a 1 1 0 1 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // m 18.3 -9.71
          moveToRelative(dx = 18.3f, dy = -9.71f)
          // l -8.3 8.3
          lineToRelative(dx = -8.3f, dy = 8.3f)
          // l -8.3 -8.3
          lineToRelative(dx = -8.3f, dy = -8.3f)
          // L 7.82 6
          lineTo(x = 7.82f, y = 6.0f)
          // h 16.36z
          horizontalLineToRelative(dx = 16.36f)
          close()
          // M 6 5
          moveTo(x = 6.0f, y = 5.0f)
          // a 1 1 0 1 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // m 21 1
          moveToRelative(dx = 21.0f, dy = 1.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
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
      .also { _modelTuned = it }
  }

@Suppress("ObjectPropertyName")
private var _modelTuned: ImageVector? = null
