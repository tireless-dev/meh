// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ContainerRuntime: ImageVector
  get() {
    val current = _containerRuntime
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ContainerRuntime",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 24 v-2 h-2.1 c-.1 -.6 -.4 -1.2 -.7 -1.8 l1.5 -1.5 -1.4 -1.4 -1.5 1.5 a5 5 0 0 0 -1.8 -.7 V16 h-2 v2.1 c-.6 .1 -1.2 .4 -1.8 .7 l-1.5 -1.5 -1.4 1.4 1.5 1.5 a5 5 0 0 0 -.7 1.8 H16 v2 h2.1 c.1 .6 .4 1.2 .7 1.8 l-1.5 1.5 1.4 1.4 1.5 -1.5 c.5 .3 1.1 .6 1.8 .7 V30 h2 v-2.1 c.6 -.1 1.2 -.4 1.8 -.7 l1.5 1.5 1.4 -1.4 -1.5 -1.5 c.3 -.5 .6 -1.1 .7 -1.8z m-7 2 c-1.7 0 -3 -1.3 -3 -3 s1.3 -3 3 -3 3 1.3 3 3 -1.3 3 -3 3
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
          // c -0.1 -0.6 -0.4 -1.2 -0.7 -1.8
          curveToRelative(
            dx1 = -0.1f,
            dy1 = -0.6f,
            dx2 = -0.4f,
            dy2 = -1.2f,
            dx3 = -0.7f,
            dy3 = -1.8f,
          )
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // l -1.4 -1.4
          lineToRelative(dx = -1.4f, dy = -1.4f)
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -1.8 -0.7
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.8f,
            dy1 = -0.7f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.1
          verticalLineToRelative(dy = 2.1f)
          // c -0.6 0.1 -1.2 0.4 -1.8 0.7
          curveToRelative(
            dx1 = -0.6f,
            dy1 = 0.1f,
            dx2 = -1.2f,
            dy2 = 0.4f,
            dx3 = -1.8f,
            dy3 = 0.7f,
          )
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // l -1.4 1.4
          lineToRelative(dx = -1.4f, dy = 1.4f)
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // a 5 5 0 0 0 -0.7 1.8
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.7f,
            dy1 = 1.8f,
          )
          // H 16
          horizontalLineTo(x = 16.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.1
          horizontalLineToRelative(dx = 2.1f)
          // c 0.1 0.6 0.4 1.2 0.7 1.8
          curveToRelative(
            dx1 = 0.1f,
            dy1 = 0.6f,
            dx2 = 0.4f,
            dy2 = 1.2f,
            dx3 = 0.7f,
            dy3 = 1.8f,
          )
          // l -1.5 1.5
          lineToRelative(dx = -1.5f, dy = 1.5f)
          // l 1.4 1.4
          lineToRelative(dx = 1.4f, dy = 1.4f)
          // l 1.5 -1.5
          lineToRelative(dx = 1.5f, dy = -1.5f)
          // c 0.5 0.3 1.1 0.6 1.8 0.7
          curveToRelative(
            dx1 = 0.5f,
            dy1 = 0.3f,
            dx2 = 1.1f,
            dy2 = 0.6f,
            dx3 = 1.8f,
            dy3 = 0.7f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.1
          verticalLineToRelative(dy = -2.1f)
          // c 0.6 -0.1 1.2 -0.4 1.8 -0.7
          curveToRelative(
            dx1 = 0.6f,
            dy1 = -0.1f,
            dx2 = 1.2f,
            dy2 = -0.4f,
            dx3 = 1.8f,
            dy3 = -0.7f,
          )
          // l 1.5 1.5
          lineToRelative(dx = 1.5f, dy = 1.5f)
          // l 1.4 -1.4
          lineToRelative(dx = 1.4f, dy = -1.4f)
          // l -1.5 -1.5
          lineToRelative(dx = -1.5f, dy = -1.5f)
          // c 0.3 -0.5 0.6 -1.1 0.7 -1.8z
          curveToRelative(
            dx1 = 0.3f,
            dy1 = -0.5f,
            dx2 = 0.6f,
            dy2 = -1.1f,
            dx3 = 0.7f,
            dy3 = -1.8f,
          )
          close()
          // m -7 2
          moveToRelative(dx = -7.0f, dy = 2.0f)
          // c -1.7 0 -3 -1.3 -3 -3
          curveToRelative(
            dx1 = -1.7f,
            dy1 = 0.0f,
            dx2 = -3.0f,
            dy2 = -1.3f,
            dx3 = -3.0f,
            dy3 = -3.0f,
          )
          // s 1.3 -3 3 -3
          reflectiveCurveToRelative(
            dx1 = 1.3f,
            dy1 = -3.0f,
            dx2 = 3.0f,
            dy2 = -3.0f,
          )
          // s 3 1.3 3 3
          reflectiveCurveToRelative(
            dx1 = 3.0f,
            dy1 = 1.3f,
            dx2 = 3.0f,
            dy2 = 3.0f,
          )
          // s -1.3 3 -3 3
          reflectiveCurveToRelative(
            dx1 = -1.3f,
            dy1 = 3.0f,
            dx2 = -3.0f,
            dy2 = 3.0f,
          )
        }
        // M14 28 H6 a2 2 0 0 1 -2 -2 V6 a2 2 0 0 1 2 -2 h20 a2 2 0 0 1 2 2 v8 h-2 V6 H6 v20 h8z
        path(
          strokeLineWidth = 0.0f,
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 28
          moveTo(x = 14.0f, y = 28.0f)
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
          // V 6
          verticalLineTo(y = 6.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v 20
          verticalLineToRelative(dy = 20.0f)
          // h 8z
          horizontalLineToRelative(dx = 8.0f)
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
      .also { _containerRuntime = it }
  }

@Suppress("ObjectPropertyName")
private var _containerRuntime: ImageVector? = null
