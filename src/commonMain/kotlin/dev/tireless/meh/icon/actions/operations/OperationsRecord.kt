// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val OperationsRecord: ImageVector
  get() {
    val current = _operationsRecord
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.OperationsRecord",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="10" height="2" x="20.0" y="20.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 20
          moveTo(x = 20.0f, y = 20.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="20.0" y="24.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 24
          moveTo(x = 20.0f, y = 24.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // <rect width="10" height="2" x="20.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 28
          moveTo(x = 20.0f, y = 28.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
          close()
        }
        // M16 20 a3.9 3.9 0 0 1 -4 -4 3.9 3.9 0 0 1 4 -4 3.9 3.9 0 0 1 4 4 h2 a6 6 0 1 0 -6 6Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 20
          moveTo(x = 16.0f, y = 20.0f)
          // a 3.9 3.9 0 0 1 -4 -4
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // a 3.9 3.9 0 0 1 4 -4
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 3.9 3.9 0 0 1 4 4
          arcToRelative(
            a = 3.9f,
            b = 3.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = 4.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 6 6 0 1 0 -6 6z
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = 6.0f,
          )
          close()
        }
        // m29.3 11.04 -2.36 -4.08 a2 2 0 0 0 -2.37 -.9 l-2.43 .82 a11 11 0 0 0 -1.31 -.75 l-.5 -2.52 A2 2 0 0 0 18.35 2 h-4.72 a2 2 0 0 0 -1.96 1.6 l-.5 2.53 a11 11 0 0 0 -1.33 .75 L7.43 6.06 a2 2 0 0 0 -2.37 .9 L2.7 11.04 a2 2 0 0 0 .4 2.5 l1.94 1.7 Q5 15.61 5 16 l.03 .77 -1.92 1.68 a2 2 0 0 0 -.41 2.5 l2.36 4.1 a2 2 0 0 0 2.37 .89 l2.43 -.82 a11 11 0 0 0 1.31 .75 l.5 2.52 A2 2 0 0 0 13.65 30 H16 v-2 h-2.36 l-.71 -3.55 a9 9 0 0 1 -2.7 -1.57 L6.8 24.04 l-2.36 -4.08 2.72 -2.4 a9 9 0 0 1 0 -3.13 l-2.72 -2.39 2.36 -4.08 3.43 1.16 a9 9 0 0 1 2.7 -1.57 L13.65 4 h4.72 l.71 3.55 a9 9 0 0 1 2.7 1.57 l3.44 -1.16 2.36 4.08 -2.8 2.46 L26.1 16 l2.8 -2.45 a2 2 0 0 0 .41 -2.5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.3 11.04
          moveTo(x = 29.3f, y = 11.04f)
          // l -2.36 -4.08
          lineToRelative(dx = -2.36f, dy = -4.08f)
          // a 2 2 0 0 0 -2.37 -0.9
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.37f,
            dy1 = -0.9f,
          )
          // l -2.43 0.82
          lineToRelative(dx = -2.43f, dy = 0.82f)
          // a 11 11 0 0 0 -1.31 -0.75
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.31f,
            dy1 = -0.75f,
          )
          // l -0.5 -2.52
          lineToRelative(dx = -0.5f, dy = -2.52f)
          // A 2 2 0 0 0 18.35 2
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 18.35f,
            y1 = 2.0f,
          )
          // h -4.72
          horizontalLineToRelative(dx = -4.72f)
          // a 2 2 0 0 0 -1.96 1.6
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.96f,
            dy1 = 1.6f,
          )
          // l -0.5 2.53
          lineToRelative(dx = -0.5f, dy = 2.53f)
          // a 11 11 0 0 0 -1.33 0.75
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.33f,
            dy1 = 0.75f,
          )
          // L 7.43 6.06
          lineTo(x = 7.43f, y = 6.06f)
          // a 2 2 0 0 0 -2.37 0.9
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.37f,
            dy1 = 0.9f,
          )
          // L 2.7 11.04
          lineTo(x = 2.7f, y = 11.04f)
          // a 2 2 0 0 0 0.4 2.5
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.4f,
            dy1 = 2.5f,
          )
          // l 1.94 1.7
          lineToRelative(dx = 1.94f, dy = 1.7f)
          // Q 5 15.61 5 16
          quadTo(
            x1 = 5.0f,
            y1 = 15.61f,
            x2 = 5.0f,
            y2 = 16.0f,
          )
          // l 0.03 0.77
          lineToRelative(dx = 0.03f, dy = 0.77f)
          // l -1.92 1.68
          lineToRelative(dx = -1.92f, dy = 1.68f)
          // a 2 2 0 0 0 -0.41 2.5
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.41f,
            dy1 = 2.5f,
          )
          // l 2.36 4.1
          lineToRelative(dx = 2.36f, dy = 4.1f)
          // a 2 2 0 0 0 2.37 0.89
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.37f,
            dy1 = 0.89f,
          )
          // l 2.43 -0.82
          lineToRelative(dx = 2.43f, dy = -0.82f)
          // a 11 11 0 0 0 1.31 0.75
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.31f,
            dy1 = 0.75f,
          )
          // l 0.5 2.52
          lineToRelative(dx = 0.5f, dy = 2.52f)
          // A 2 2 0 0 0 13.65 30
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 13.65f,
            y1 = 30.0f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.36
          horizontalLineToRelative(dx = -2.36f)
          // l -0.71 -3.55
          lineToRelative(dx = -0.71f, dy = -3.55f)
          // a 9 9 0 0 1 -2.7 -1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.7f,
            dy1 = -1.57f,
          )
          // L 6.8 24.04
          lineTo(x = 6.8f, y = 24.04f)
          // l -2.36 -4.08
          lineToRelative(dx = -2.36f, dy = -4.08f)
          // l 2.72 -2.4
          lineToRelative(dx = 2.72f, dy = -2.4f)
          // a 9 9 0 0 1 0 -3.13
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.13f,
          )
          // l -2.72 -2.39
          lineToRelative(dx = -2.72f, dy = -2.39f)
          // l 2.36 -4.08
          lineToRelative(dx = 2.36f, dy = -4.08f)
          // l 3.43 1.16
          lineToRelative(dx = 3.43f, dy = 1.16f)
          // a 9 9 0 0 1 2.7 -1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.7f,
            dy1 = -1.57f,
          )
          // L 13.65 4
          lineTo(x = 13.65f, y = 4.0f)
          // h 4.72
          horizontalLineToRelative(dx = 4.72f)
          // l 0.71 3.55
          lineToRelative(dx = 0.71f, dy = 3.55f)
          // a 9 9 0 0 1 2.7 1.57
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.7f,
            dy1 = 1.57f,
          )
          // l 3.44 -1.16
          lineToRelative(dx = 3.44f, dy = -1.16f)
          // l 2.36 4.08
          lineToRelative(dx = 2.36f, dy = 4.08f)
          // l -2.8 2.46
          lineToRelative(dx = -2.8f, dy = 2.46f)
          // L 26.1 16
          lineTo(x = 26.1f, y = 16.0f)
          // l 2.8 -2.45
          lineToRelative(dx = 2.8f, dy = -2.45f)
          // a 2 2 0 0 0 0.41 -2.5
          arcToRelative(
          a = 2.0f,
          b = 2.0f,
          theta = 0.0f,
          isMoreThanHalf = false,
          isPositiveArc = false,
          dx1 = 0.41f,
          dy1 = -2.5f,
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
      .also { _operationsRecord = it }
  }

@Suppress("ObjectPropertyName")
private var _operationsRecord: ImageVector? = null
